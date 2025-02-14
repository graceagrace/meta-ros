# Copyright (c) 2024 Wind River Systems, Inc.

<<<<<<< HEAD
export GZ_RELAX_VERSION_MATCH="1"

=======
>>>>>>> origin/master-next
EXTRA_OECMAKE += " \
    -DPROTOBUF_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/protoc \
"

<<<<<<< HEAD
ROS_BUILD_DEPENDS += "gz-gui8"
=======
ROS_BUILD_DEPENDS += "gz-gui9"
>>>>>>> origin/master-next
ROS_BUILDTOOL_DEPENDS += "protobuf-native"
