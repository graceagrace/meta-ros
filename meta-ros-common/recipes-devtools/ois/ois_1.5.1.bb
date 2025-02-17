# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=db5da1a57f92d70695878148529ef329"

SRC_URI = "git://github.com/wgois/OIS.git;protocol=https;branch=master"

# Modify these as desired
PV = "1.5.1"
SRCREV = "27928350a7a7be9dd7e12e44d534a20265784ae2"

S = "${WORKDIR}/git"

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS = "libx11"

inherit cmake features_check

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

