# Copyright (c) 2024 Wind River Systems, Inc.

<<<<<<< HEAD
ROS_BUILD_DEPENDS += "gz-msgs10"
ROS_BUILDTOOL_DEPENDS += "gz-msgs10-native protobuf-native"
=======
ROS_BUILD_DEPENDS += "gz-msgs11"
ROS_BUILDTOOL_DEPENDS += "gz-msgs11-native protobuf-native"
>>>>>>> origin/master-next

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://Set-protoc-executable.patch"

EXTRA_OECMAKE += " \
    -DPROTOBUF_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/protoc \
"

BBCLASSEXTEND = "native nativesdk"
