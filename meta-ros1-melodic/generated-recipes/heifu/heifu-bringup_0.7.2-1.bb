# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Heifu is a ROS driver for PDMFC and BEV drone"
AUTHOR = "João Pedro Carvalho <joao.m.carvalho@pdmfc.com>"
ROS_AUTHOR = "João Pedro Carvalho <joao.m.carvalho@pdmfc.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "heifu"
ROS_BPN = "heifu_bringup"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    heifu-description \
    heifu-mavros \
    heifu-msgs \
    heifu-safety \
    heifu-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    heifu-description \
    heifu-mavros \
    heifu-msgs \
    heifu-safety \
    heifu-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/amferreiraBEV/heifu-release/archive/release/melodic/heifu_bringup/0.7.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/heifu_bringup"
SRC_URI = "git://github.com/amferreiraBEV/heifu-release;${ROS_BRANCH};protocol=https"
SRCREV = "9e308a9fd396b87dd1679b80653b5e08b10e9af3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
