
import numpy as np
from matplotlib import pyplot as plt
from matplotlib import animation

a = 2
b = 1
t = np.linspace(0, 4 * np.pi, 100)
rect_width = 1
rect_height = 0.5
rect_x = a - rect_width
rect_y = 0
fig, ax = plt.subplots()
ax.plot([], [])
rectangle = ax.add_patch(plt.Rectangle((rect_x,rect_y),rect_width, rect_height,color='green'))

def animate(i):
    #x, y = patch.center
    rect_x = a * np.cos(i) - rect_width/2
    rect_y = b* np.sin(i) - rect_height/2
    rectangle.set_xy((rect_x, rect_y))
    return rectangle

anim = animation.FuncAnimation(fig, animate, frames=t,interval=50)

ax.set_xlim ([-a-0.5,a+0.5])
ax.set_ylim ([-b-0.5,b+0.5])

anim.save('ellipse_animation.gif',writer='imagemagick')

plt.show()
