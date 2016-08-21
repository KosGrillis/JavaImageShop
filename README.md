# JavaImageShop
A very simple, extensible image editor written in Java.

Takes an input image path, an output image path and the desired image effects. Outputs the original image with the effects applied to the path specified by the output image path.

Current supported effects:
- greyscale
- brighten
- invert
- darken

Usage:

ImageShop [INPUT FILE PATH] [OUTPUT FILE PATH] [[EFFECT], ...]

New effects may be defined by creating a new class and having it implement the Effect interface. Add a new instance of this effect to the initialise function of the EffectLibrary class.
