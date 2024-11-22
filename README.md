# meta-bootgen
Yocto meta layer for Xilinx bootgen utiity

This README file contains information on the contents of the meta-bootgen layer.
Please see the corresponding sections below for details.

WARNING: this meta layer project has not been finalized: there is a known compilation issue of openssl library being not visible to the Yocto toolchain compiler. The issue is to be further investigated and resolved.

# Dependencies
  openssl library

# Patches

No patches are available for this meta layer at this moment.
Please submit any patches against the meta-mylayer layer to the maintainer:

Maintainer: Evgeny Kirshin <ekirshin.pro@gmail.com>


# Table of Contents

I. Adding the meta-bootgen layer to your build

# I. Adding the meta-mylayer layer to your build

Run 'bitbake-layers add-layer meta-bootgen'

Make sure openssl library is available to the Yocto build toolchain: add the following line to the local.conf file:
IMAGE_INSTALL:append = " openssl"


