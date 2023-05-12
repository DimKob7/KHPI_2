import numpy as np
from matplotlib import pyplot as plt

n = 256
x = np.linspace(0., 9., n) # діапазон по X
y = np.linspace(0., 9., n) # діапазон по Y
X, Y = np.meshgrid(x, y)

Z = X*np.sqrt(Y) - Y*X**2 # Формула скалярного поля

plt.pcolormesh(X, Y, Z)
plt.title('Візуалізація скалярного поля')
plt.savefig('photo3_1.png')
plt.show()

import numpy as np
import matplotlib.pyplot as plt

def u(x, y):
    # return -2*np.log(x**2 + 5) - 4*x*y
    return x+y

def v(x, y):
    # return -4 * x ** 2
    return x-y

xx, yy = np.meshgrid(np.linspace(-9, 9, 9), np.linspace(-9, 9, 9))
u_val = u(xx, yy)
v_val = v(xx, yy)

# Векторне поле
plt.quiver(xx, yy, u_val, v_val)
plt.title('Візуалізація векторного поля векторами')
plt.savefig('photo3_2.png')
plt.show()

# Візуалізація векторного поля лініями потоку
fig, ax = plt.subplots()
ax.set_aspect('equal', 'box')
ax.streamplot(xx, yy, u_val, v_val, color=u_val, cmap='viridis')
plt.title('Візуалізація векторного поля лініями потоку')
plt.savefig('photo3_3.png')
plt.show()


import matplotlib.pyplot as plt
import numpy as np

# Задаємо область визначення
x, y, z = np.meshgrid(np.arange(-9, 9, 0.6),
                      np.arange(-9, 9, 0.6),
                      np.arange(-9, 9, 2.0))

# Обчислюємо векторне поле
Fx = 1 / y - z / x ** 2
Fy = 1 / z - x / y ** 2
Fz = 1 / x - y / z ** 2


# Створюємо тривимірний графік
fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')

# Будуємо векторне поле за допомогою функції quiver
ax.quiver(x, y, z, Fx, Fy, Fz, length=0.5, normalize=True, cmap='viridis')

# Встановлюємо підписи осей та заголовок
ax.set_xlabel('X')
ax.set_ylabel('Y')
ax.set_zlabel('Z')
ax.set_title(r'$F = (\frac{1}{y} - \frac{z}{x^2};\frac{1}{z} - \frac{x}{y^2}; \frac{1}{x} - \frac{y}{z^2})$')

plt.savefig('photo3_4.png')
plt.show()

import numpy as np
import matplotlib.pyplot as plt
from mayavi import mlab
import glyph_visualization_lib as gvl


def main():
    x = np.linspace(1, 5, 10, dtype=float, endpoint=True)
    y = np.linspace(1, 5, 10, dtype=float, endpoint=True)
    z = np.linspace(1, 5, 10, dtype=float, endpoint=True)

    X, Y, Z = np.meshgrid(x, y, z)

    stress_tensor = np.array(([np.log(X)/(X**2+Y**2+Z**2), np.sqrt(X), np.sqrt(Y)],
                              [np.sqrt(X), np.log(X)/(X**2+Y**2+Z**2), np.sqrt(Z)],
                              [np.sqrt(Y), np.sqrt(Z), np.log(X)/(X**2+Y**2+Z**2)]))
    print(stress_tensor.shape)
    vm_stress = gvl.get_von_Mises_stress(stress_tensor)
    glyph_radius = 0.25
    limits = [np.min(vm_stress), np.max(vm_stress)]
    colormap = plt.get_cmap('rainbow', 120)
    fig = mlab.figure(bgcolor=(1, 1, 1))
    fig2 = plt.figure()
    ax = fig2.add_subplot(111, projection='3d')
    for i in range(x.size):
        for j in range(y.size):
            for k in range(z.size):
                center = [x[i], y[j], z[k]]
                data = stress_tensor[:, :, i, j, k]
                color = colormap(gvl.get_colormap_ratio_on_stress(vm_stress[i, j, k], limits))[:3]

                """ glyph_type = {0: 'cuboid', 1: 'cylinder', 2: 'ellipsoid', 3: 'superquadric'}
                if glyph_type == 3 (superquadric)
                there are glyph shape type
                0 - superquadrics,
                1 - Kindlmann_glyph,
                2 - Kindlmann_modified_glyph """

                x_g, y_g, z_g = gvl.get_glyph_data(center, data, limits, glyph_points=12, glyph_radius=glyph_radius,
                                                   glyph_type=2)

                mlab.mesh(x_g, y_g, z_g, color=color)

    mlab.move(forward=1.8)
    #mlab.savefig("superquadric-Kindlmann_modified-viz.png", size=(100, 100))
    mlab.savefig('photo3_5.png', size=(100, 100))
    mlab.show()
    pass


if __name__ == '__main__':
    main()