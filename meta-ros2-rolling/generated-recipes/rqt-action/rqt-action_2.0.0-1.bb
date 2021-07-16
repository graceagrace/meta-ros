# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "rqt_action provides a feature to introspect all available ROS   action types. By utilizing rqt_msg, the output format is   unified with it and rqt_srv. Note that the actions shown on this plugin   is the ones that are stored on your machine, not on the ROS core your rqt   instance connects to."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
ROS_AUTHOR = "Isaac Isao Saito"
HOMEPAGE = "http://wiki.ros.org/rqt_action"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_action"
ROS_BPN = "rqt_action"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    rclpy \
    rqt-gui \
    rqt-gui-py \
    rqt-msg \
    rqt-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rqt_action-release/archive/release/rolling/rqt_action/2.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rqt_action"
SRC_URI = "git://github.com/ros2-gbp/rqt_action-release;${ROS_BRANCH};protocol=https"
SRCREV = "2771a8e0466dffab6cf55e449f895627cb1b6974"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
