# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "NTRIP client that will publish RTCM corrections to a ROS topic, and optionally subscribe to NMEA messages to send to an NTRIP server"
AUTHOR = "Rob Fisher <rob.fisher@parker.com>"
ROS_AUTHOR = "Parker Hannifin Corp"
HOMEPAGE = "https://github.com/LORD-MicroStrain/ntrip_client"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "ntrip_client"
ROS_BPN = "ntrip_client"

ROS_BUILD_DEPENDS = " \
    nmea-msgs \
    rclpy \
    rtcm-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    nmea-msgs \
    rclpy \
    rtcm-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    nmea-msgs \
    rclpy \
    rtcm-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ntrip_client-release/archive/release/rolling/ntrip_client/1.3.0-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/ntrip_client"
SRC_URI = "git://github.com/ros2-gbp/ntrip_client-release;${ROS_BRANCH};protocol=https"
SRCREV = "c3ee956ac42a9068a5941b9c23b8c3ece666aacc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
