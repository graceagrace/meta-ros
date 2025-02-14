# Copyright (c) 2024 Wind River Systems, Inc.

# ERROR: QA Issue: non -dev/-dbg/nativesdk- package gz-math-vendor contains symlink .so '/opt/ros/rolling/lib/libgz-math7.so' [dev-so]
inherit ros_insane_dev_so

<<<<<<< HEAD
ROS_BUILD_DEPENDS += "gz-math7"

export GZ_RELAX_VERSION_MATCH="1"
=======
ROS_BUILD_DEPENDS += "gz-math8"
>>>>>>> master-next

BBCLASSEXTEND = "native nativesdk"
