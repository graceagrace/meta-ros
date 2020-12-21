# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "eus_qp is an interface of euslisp to solve qp problems with linear constraints."
AUTHOR = "Noda Shintaro <s-noda@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "jsk_control"
ROS_BPN = "eus_qp"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    euslisp \
    libeigen \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    euslisp \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    euslisp \
    libeigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    eus-qpoases \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_control-release/archive/release/melodic/eus_qp/0.1.15-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/eus_qp"
SRC_URI = "git://github.com/tork-a/jsk_control-release;${ROS_BRANCH};protocol=https"
SRCREV = "ab53ff73d7fc32b85e13fa88d3237d39b1b41f0f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
