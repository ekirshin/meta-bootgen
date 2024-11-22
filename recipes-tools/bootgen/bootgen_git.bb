DESCRIPTION = "Xilinx Bootgen tool"

LICENSE = "GPLv3"

SRC_URI = "git://github.com/Xilinx/bootgen.git;protocol=https" 
SRCREV = "f9f477adf243fa40bc8c7316a7aac37a0efd426d"

S = "${WORKDIR}/git"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c979df673927004a489691fc457facff"

# Add openssl as a dependency 
DEPENDS = "openssl"

do_compile() {
    make
}

do_install() {
    install -D -m 755 ${WORKDIR}/bootgen/bootgen ${D}${bindir}/bootgen
}
