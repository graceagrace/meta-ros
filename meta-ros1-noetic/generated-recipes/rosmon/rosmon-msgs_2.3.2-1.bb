# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Messages for rosmon, the node launcher and monitor for ROS. 		rosmon is a replacement for the roslaunch tool, focused on performance, 		remote monitoring, and usability."
AUTHOR = "Max Schwarz <max.schwarz@uni-bonn.de>"
ROS_AUTHOR = "Max Schwarz <max.schwarz@uni-bonn.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

ROS_CN = "rosmon"
ROS_BPN = "rosmon_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-generation \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/xqms/rosmon-release/archive/release/noetic/rosmon_msgs/2.3.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rosmon_msgs"
SRC_URI = "git://github.com/xqms/rosmon-release;${ROS_BRANCH};protocol=https"
SRCREV = "5cc2bac40af32f2237ce22d2503a1eb3d73b0588"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
