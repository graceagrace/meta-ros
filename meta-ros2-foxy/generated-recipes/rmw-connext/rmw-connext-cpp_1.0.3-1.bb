# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Implement the ROS middleware interface using RTI Connext static code generation in C++."
AUTHOR = "Alejandro Hernandez Cordero <alejandro@openrobotics.org>"
ROS_AUTHOR = "Dirk Thomas"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmw_connext"
ROS_BPN = "rmw_connext_cpp"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-rti-connext-dds-5.3.1} \
    connext-cmake-module \
    rcpputils \
    rcutils \
    rmw \
    rmw-connext-shared-cpp \
    rosidl-generator-dds-idl \
    rosidl-runtime-c \
    rosidl-runtime-cpp \
    rosidl-typesupport-connext-c \
    rosidl-typesupport-connext-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-rti-connext-dds-5.3.1} \
    connext-cmake-module \
    rosidl-runtime-c \
    rosidl-runtime-cpp \
    rosidl-typesupport-connext-c \
    rosidl-typesupport-connext-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    rosidl-cmake-native \
"

ROS_EXEC_DEPENDS = " \
    rcpputils \
    rcutils \
    rmw \
    rmw-connext-shared-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmw_connext-release/archive/release/foxy/rmw_connext_cpp/1.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/rmw_connext_cpp"
SRC_URI = "git://github.com/ros2-gbp/rmw_connext-release;${ROS_BRANCH};protocol=https"
SRCREV = "82a91c91406842d8c1cc168f0bb2dccddfd5159e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
