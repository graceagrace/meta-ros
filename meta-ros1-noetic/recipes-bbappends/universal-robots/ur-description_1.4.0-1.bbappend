# Copyright (c) 2024 Wind River Systems, Inc.

# The value from package.xml breaks parsing the recipe it with bitbake.
#
# The recipe generated by superflore uses ASCII single quotes instead
# of UTF-8 right single quotation mark. This causes bitbake to have
# syntax errors if we try to use string replacement like with the ROS 2
# ur-description recipe.
LICENSE = "BSD-3-Clause & Universal-Robots-A-S"
