# IKEA Trådfri
This is a device handler for use with [SmartThings](https://www.smartthings.com/) and supports the tunable white [IKEA Trådfri bulbs](http://www.ikea.com/us/en/search/?query=tradfri)

The reason for this device handler is because i wanted a bulb that behaved a bit more like traditional bulbs that glow with a warmer light at low levels and a colder light at higher levels.

**Works:**
- TRADFRI bulb E27 WS opal 980lm
- TRADFRI bulb E14 WS opal 400lm
- TRADFRI bulb GU10 WS 400lm

**Untested but should work:**
- TRADFRI bulb E27 WS clear 950lm
- TRADFRI bulb E26 WS opal 980lm
- TRADFRI bulb E26 WS clear 950lm
- TRADFRI bulb E12 WS opal 400lm

**Not supported:**
- TRADFRI bulb E27 opal 1000lm - It's not a color temperature bulb, just dimmable

## Features
- Link/Unlink light level and color temperature
- Set min and max color temperature when linked
- Adjustable delay between level change and color temperature change
- Show friendly color temperature names or kelvin color temperature
- Three predefined color temperature tiles that map to the ones IKEA mentions in the product description, not the same names though
- A "next color" tile that loops through the three predefined color temperatures

## Installation
There is a good explanation of how to install custom device handlers over at the [SmartThings community forum](https://community.smartthings.com/t/ikea-tradfri/59229/189)

You can also integrate GitHub into the SmartThings IDE by following [this guide](http://docs.smartthings.com/en/latest/tools-and-ide/github-integration.html) and you can ignore the first warning about "GitHub IDE integration is not supported outside the US" because it works fine outside the US.

I would suggest adding this device handler before adding the IKEA Trådfri bulbs to your SmartThings hub since it will then automatically detect them and assign this handler. If you ad the handler after adding the bulbs you will need to use the IDE to assing the device type and you might need to press "reload" in the app.

![Reload tile](https://github.com/edvaldeysteinsson/IKEA-Tradfri/blob/master/images/01.png)

## Screenshots
![Reload tile](https://github.com/edvaldeysteinsson/IKEA-Tradfri/blob/master/images/02.png)

![Reload tile](https://github.com/edvaldeysteinsson/IKEA-Tradfri/blob/master/images/03.png)

![Reload tile](https://github.com/edvaldeysteinsson/IKEA-Tradfri/blob/master/images/04.png)
