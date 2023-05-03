from matplotlib.ticker import MaxNLocator, FormatStrFormatter
from collections import namedtuple
from mpl_toolkits.mplot3d import Axes3D
import matplotlib.pyplot as plt
from matplotlib import cm
from matplotlib.ticker import LinearLocator
import numpy as np
import matplotlib.pyplot as plt

x = np.arange(-2, 2, 0.01)
y = (1 + x * np.exp(-x)) * (np.sin(x) ** 2) / (2 + x ** 2)
def z_func(x):
    if x <0:
        z=(1+5*x)/(3+x**2)

    elif x >= 1:
        z= (np.sin(x+1)**3)*np.exp(0.6*x)

    else:
        z=(np.sin(x)**2)*np.sqrt(5+x)

    return z

Z = np.array([z_func(i) for i in x])
ax = plt.subplot()
plt1 = ax.plot(x, y, label=r"$y=\frac{(1+x*\exp(-x))*(\sin(x)**2)}{(2+x**2)}$")
plt2 = ax.plot(x, Z, label=r'$z=\frac{1+5*x}{3+x**2} or (\sin(x+1)**3)*\exp(0.6*x) or (\sin(x)**2)*np.sqrt(5+x)$')
# plt2 = ax.plot(x, z1 , label=r'$z=\frac{1+5*x}{3+x**2} or (\sin(x+1)**3)*\exp(0.6*x) or (\sin(x)**2)*np.sqrt(5+x)$')
# plt3 = ax.plot(x, z2, label=r'$z=\frac{1+5*x}{3+x**2} or (\sin(x+1)**3)*\exp(0.6*x) or (\sin(x)**2)*np.sqrt(5+x)$')
# plt4 = ax.plot(x, z3, label=r'$z=\frac{1+5*x}{3+x**2} or (\sin(x+1)**3)*\exp(0.6*x) or (\sin(x)**2)*np.sqrt(5+x)$')
plt.xlabel(r'$x$')
plt.ylabel(r'$f(x)$')
pos= ax.get_position()
ax.set_position([pos.x0, pos.y0, pos.width, pos.height*0.85])
ax.legend(loc='upper center', bbox_to_anchor=(0.5,1.35),ncol=1)
ax.grid(True)
plt.savefig('photo1.png')
plt.show()

fig = plt.figure()
ax = fig.add_subplot(projection='3d')
# Make data.
#X = np.arange(-5, 15, 0.10)
#Y = np.arange(-10, 10, 0.10)
X = np.arange(0, 1.29, 0.1)
Y = np.arange(0, 6.29, 0.1)
X, Y = np.meshgrid(X, Y)
Z = (10*Y*(np.tan(X**3+1)) + (np.sin(X**2-10*Y)))

# Plot the surface.

surf = ax.plot_surface(X, Y, Z,rstride=8, cstride=8,alpha=0.8, cmap=cm.coolwarm,linewidth=0, antialiased=False)
ax.set_xlabel('X')
ax.set_ylabel('Y')
ax.set_zlabel('Z')
ax.set_title(r'$Z=10Y*(\tan(X^3+1)) + \sin(X^2-10Y)$')
# Customize the z axis.
#ax.set_zlim(-10000.01, 2000.01)
ax.zaxis.set_major_locator(LinearLocator(10))

# Add a color bar which maps values to colors.
fig.colorbar(surf, shrink=0.5, aspect=5)
plt.savefig('photo2.png')
plt.show()

import numpy as np
import matplotlib.pyplot as plt

alfa = 1.0
theta = np.linspace(0, 2*np.pi, 1000)
r1 = np.sqrt(2 * alfa**2 * np.cos(2*theta))
r2 = np.sqrt(2 * alfa**2 * np.sin(2*theta))


fig, ax = plt.subplots(subplot_kw={'projection': 'polar'})
ax.plot(theta, r1, linewidth=1, label=r'$r**2 = 2 * alfa**2 * cos(2*theta)$')
ax.plot(theta, r2, linewidth=2, label=r'$r**2 = 2 * alfa**2 * sin(2*theta)$')

ax.set_rlabel_position(-2.5)
ax.grid(True)
ax.legend(loc='right')
plt.title(r'$r**2 = 2 * alfa**2 * cos(2*theta) or $r**2 = 2 * alfa**2 * sin(2*theta)$')
plt.savefig('photo3.png')
plt.show()


import numpy as np
import matplotlib.pyplot as plt

# Constants
a = 2
b = 2

x = np.linspace(-a, a, 100)
y = np.linspace(-b, b, 100)
x, y = np.meshgrid(x, y)
z = 0.5 * ((x**2/a**2) + (y**2/b**2))

fig = plt.figure()
ax = fig.add_subplot( projection='3d')
surf = ax.plot_surface(x, y, z,rstride=8, cstride=8,alpha=0.8, cmap=cm.coolwarm,linewidth=0, antialiased=False)
ax.set_xlabel('X')
ax.set_ylabel('Y')
ax.set_zlabel('Z')
ax.set_title(r'$\frac{x**2}{a**2} + \frac{y**2}{b**2} = 2z$')
# Customize the z axis.
#ax.set_zlim(-10000.01, 2000.01)
ax.zaxis.set_major_locator(LinearLocator(10))

# Add a color bar which maps values to colors.
fig.colorbar(surf, shrink=0.5, aspect=5)
plt.savefig('photo4.png')
plt.show()

import numpy as np
import matplotlib.pyplot as plt

n_groups = 10
de = (21.5, 54, 58, 64.1, 36.5, 87.5, 185, 385, 600, 710)
fr = (22, 28.5, 40.5, 40, 31.5, 62.5, 140, 235, 330, 420)
gb = (38.5, 54.5, 73, 76, 66, 105, 160, 235, 320, 400)
be = (12.2, 15.5, 18.4, 16.8, 12.3, 27.5, 63, 112, 176, 214)

fig, ax = plt.subplots()
index = np.arange(n_groups)
bar_width = 0.2
opacity = 1
bar1 = np.arange(len(de))
bar2 = [x + bar_width for x in bar1]
bar3 = [x + bar_width for x in bar2]
bar4 = [x + bar_width for x in bar3]

rects1 = ax.bar(bar1, de, bar_width, alpha=opacity, color= 'blue', label='Німеччина')
rects2 = ax.bar(bar2, fr, bar_width, alpha=opacity, color= 'green', label='Франція')
rects3 = ax.bar(bar3, gb, bar_width, alpha=opacity, color= 'gray', label='Великобританія')
rects4 = ax.bar(bar4, be, bar_width, alpha=opacity, color= 'magenta', label='Бельгія')

ax.grid(True, linestyle ='-')
ax.set_xlabel('Роки')
ax.set_ylabel('Млрд. долл.')
ax.set_title('Світовий   товарний   експорт, в   цінах  на  2000 р.')
ax.set_xticks(index + 2.0*bar_width)
ax.set_xticklabels(('1900', '1913', '1929', '1938', '1950', '1960', '1970', '1980', '1990', '2000'))
ax.legend(loc='upper left')
fig.tight_layout()
plt.savefig('photo5.png')
plt.show()

import matplotlib.pyplot as plt
import numpy as np

Array = np.array([[21.5, 54, 58, 64.1, 36.5, 87.5, 185, 385, 600, 710],
                [22, 28.5, 40.5, 40, 31.5, 62.5, 140, 235, 330, 420],
                [38.5, 54.5, 73, 76, 66, 105, 160, 235, 320, 400],
                [12.2, 15.5, 18.4, 16.8, 12.3, 27.5, 63, 112, 176, 214]])
y_labels = np.array(['DEU', 'FRA', 'GBR', 'BEL'])
x_labels = np.array(['1900', '1913', '1929', '1938', '1950', '1960', '1970', '1980', '1990', '2000'])
xpos, ypos = np.meshgrid(np.arange(Array.shape[1]), np.arange(Array.shape[0]))
xpos = xpos.flatten()
ypos = ypos.flatten()
zpos = np.zeros_like(xpos)

# parameters bars
x = 0.6 * np.ones_like(zpos)
y = x.copy()
f = Array.flatten()
ypos = np.add(ypos, -0.5 * y)
fig = plt.figure()
ax = fig.add_subplot(projection='3d')
colors = ['blue', 'green', 'gray', 'magenta']
for i, country in enumerate(y_labels):
    start = i * len(x_labels)
    end = (i + 1) * len(x_labels)
    ax.bar3d(xpos[start:end], ypos[start:end], zpos[start:end], x[start:end], y[start:end], f[start:end],color=colors[i])
ax.set_xticks(np.arange(len(x_labels)))
ax.set_yticks(np.arange(len(y_labels)))
ax.set_xticklabels(x_labels)
ax.set_yticklabels(y_labels)
ax.set_title('Світовий   товарний   експорт,   в   цінах   на   2000 р.')
ax.set_ylabel('Країни')
ax.set_xlabel('Рокі')
ax.set_zlabel('Млрд долл')
plt.savefig('photo6.png')
plt.show()
