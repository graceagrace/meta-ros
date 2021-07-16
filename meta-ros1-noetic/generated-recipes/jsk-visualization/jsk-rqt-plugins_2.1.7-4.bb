# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The jsk_rqt_plugins package"
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://jsk-docs.readthedocs.io/en/latest/jsk_visualization/doc/jsk_rqt_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_visualization"
ROS_BPN = "jsk_rqt_plugins"

ROS_BUILD_DEPENDS = " \
    image-view2 \
    message-generation \
    mk \
    rosbuild \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python3-sklearn} \
    cv-bridge \
    image-publisher \
    image-view2 \
    jsk-gui-msgs \
    message-runtime \
    qt-gui-py-common \
    resource-retriever \
    rqt-gui \
    rqt-gui-py \
    rqt-image-view \
    rqt-plot \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_visualization-release/archive/release/noetic/jsk_rqt_plugins/2.1.7-4.tar.gz
ROS_BRANCH ?= "branch=release/noetic/jsk_rqt_plugins"
SRC_URI = "git://github.com/tork-a/jsk_visualization-release;${ROS_BRANCH};protocol=https"
SRCREV = "807ee9ba2c0c08fb1dc2e001e4c3bfd737ede89f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
