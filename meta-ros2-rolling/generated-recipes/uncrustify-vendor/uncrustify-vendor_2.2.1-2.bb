# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around uncrustify, providing nothing but a dependency on uncrustify, on some systems.     On others, it provides an ExternalProject build of uncrustify."
AUTHOR = "Scott K Logan <scott@openrobotics.org>"
ROS_AUTHOR = "Audrow Nash <audrow@openrobotics.org>"
HOMEPAGE = "https://github.com/uncrustify/uncrustify"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0 & GNU General Public License v2.0"
LICENSE = "Apache-2.0 & GPL-2.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_CN = "uncrustify_vendor"
ROS_BPN = "uncrustify_vendor"

ROS_BUILD_DEPENDS = " \
    uncrustify \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-vendor-package-native \
"

ROS_EXPORT_DEPENDS = " \
    uncrustify \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    uncrustify \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/uncrustify_vendor-release/archive/release/rolling/uncrustify_vendor/2.2.1-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/uncrustify_vendor"
SRC_URI = "git://github.com/ros2-gbp/uncrustify_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "6520ddd20ad550977380aa6b56b5099ebee5366b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
