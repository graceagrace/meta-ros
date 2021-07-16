# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The rtmros_hironx package is an operating interface via ROS and OpenRTM, for Hiro and <a href="http://nextage.kawada.jp/en/">NEXTAGE OPEN</a> dual-armed robots from Kawada Industries Inc.   <br/><br/>   NOTE for Hiro users: Utilizing this opensource controller for Hiro requires installation both on Controller Box (QNX-based) and Vision PC (Ubuntu Linux), and the steps for it are not shared publicly in order to avoid any possible inconvenience that can easily be caused by slight mis-operation during installation. Please contact <a href="http://opensource-robotics.tokyo.jp/?page_id=56&amp;lang=en">TORK</a> for an advice."
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/rtmros_hironx/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rtmros_hironx"
ROS_BPN = "rtmros_hironx"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    hironx-calibration \
    hironx-moveit-config \
    hironx-ros-bridge \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    hironx-calibration \
    hironx-moveit-config \
    hironx-ros-bridge \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/rtmros_hironx-release/archive/release/melodic/rtmros_hironx/2.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rtmros_hironx"
SRC_URI = "git://github.com/tork-a/rtmros_hironx-release;${ROS_BRANCH};protocol=https"
SRCREV = "0bc4d1bc7d3946f5c7022ec552abee4cc62a2fc4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
