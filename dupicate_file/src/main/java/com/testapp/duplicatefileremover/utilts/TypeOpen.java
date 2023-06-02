package com.testapp.duplicatefileremover.utilts;

import android.text.TextUtils;

import java.io.File;

public class TypeOpen {
    private static final String[][] listOpen = {new String[]{"3gp", "video/3gpp"}, new String[]{"aab", "application/x-authoware-bin"}, new String[]{"aam", "application/x-authoware-map"}, new String[]{"aas", "application/x-authoware-seg"}, new String[]{"ai", "application/postscript"}, new String[]{"aif", "audio/x-aiff"}, new String[]{"aifc", "audio/x-aiff"}, new String[]{"aiff", "audio/x-aiff"}, new String[]{"als", "audio/X-Alpha5"}, new String[]{"amc", "application/x-mpeg"}, new String[]{"ani", "application/octet-stream"}, new String[]{"apk", "application/vnd.android.package-archive"}, new String[]{"asc", "text/plain"}, new String[]{"asd", "application/astound"}, new String[]{"asf", "video/x-ms-asf"}, new String[]{"asn", "application/astound"}, new String[]{"asp", "application/x-asap"}, new String[]{"asx", "video/x-ms-asf"}, new String[]{"au", "audio/basic"}, new String[]{"avb", "application/octet-stream"}, new String[]{"avi", "video/x-msvideo"}, new String[]{"awb", "audio/amr-wb"}, new String[]{"bcpio", "application/x-bcpio"}, new String[]{"bin", "application/octet-stream"}, new String[]{"bld", "application/bld"}, new String[]{"bld2", "application/bld2"}, new String[]{"bmp", "image/bmp"}, new String[]{"bpk", "application/octet-stream"}, new String[]{"bz2", "application/x-bzip2"}, new String[]{"c", "text/plain"}, new String[]{"cal", "image/x-cals"}, new String[]{"ccn", "application/x-cnc"}, new String[]{"cco", "application/x-cocoa"}, new String[]{"cdf", "application/x-netcdf"}, new String[]{"cgi", "magnus-internal/cgi"}, new String[]{"chat", "application/x-chat"}, new String[]{"class", "application/octet-stream"}, new String[]{"clp", "application/x-msclip"}, new String[]{"cmx", "application/x-cmx"}, new String[]{"co", "application/x-cult3d-object"}, new String[]{"cod", "image/cis-cod"}, new String[]{"conf", "text/plain"}, new String[]{"cpio", "application/x-cpio"}, new String[]{"cpp", "text/plain"}, new String[]{"cpt", "application/mac-compactpro"}, new String[]{"crd", "application/x-mscardfile"}, new String[]{"csh", "application/x-csh"}, new String[]{"csm", "chemical/x-csml"}, new String[]{"csml", "chemical/x-csml"}, new String[]{"css", "text/css"}, new String[]{"cur", "application/octet-stream"}, new String[]{"dcm", "x-lml/x-evm"}, new String[]{"dcr", "application/x-director"}, new String[]{"dcx", "image/x-dcx"}, new String[]{"dhtml", "text/html"}, new String[]{"dir", "application/x-director"}, new String[]{"dll", "application/octet-stream"}, new String[]{"dmg", "application/octet-stream"}, new String[]{"dms", "application/octet-stream"}, new String[]{"doc", "application/msword"}, new String[]{"docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"}, new String[]{"dot", "application/x-dot"}, new String[]{"dvi", "application/x-dvi"}, new String[]{"dwf", "drawing/x-dwf"}, new String[]{"dwg", "application/x-autocad"}, new String[]{"dxf", "application/x-autocad"}, new String[]{"dxr", "application/x-director"}, new String[]{"ebk", "application/x-expandedbook"}, new String[]{"emb", "chemical/x-embl-dl-nucleotide"}, new String[]{"embl", "chemical/x-embl-dl-nucleotide"}, new String[]{"eps", "application/postscript"}, new String[]{"eri", "image/x-eri"}, new String[]{"es", "audio/echospeech"}, new String[]{"esl", "audio/echospeech"}, new String[]{"etc", "application/x-earthtime"}, new String[]{"etx", "text/x-setext"}, new String[]{"evm", "x-lml/x-evm"}, new String[]{"evy", "application/x-envoy"}, new String[]{"exe", "application/octet-stream"}, new String[]{"fh4", "image/x-freehand"}, new String[]{"fh5", "image/x-freehand"}, new String[]{"fhc", "image/x-freehand"}, new String[]{"fif", "image/fif"}, new String[]{"fm", "application/x-maker"}, new String[]{"fpx", "image/x-fpx"}, new String[]{"fvi", "video/isivideo"}, new String[]{"gau", "chemical/x-gaussian-input"}, new String[]{"gca", "application/x-gca-compressed"}, new String[]{"gdb", "x-lml/x-gdb"}, new String[]{"gif", "image/gif"}, new String[]{"gps", "application/x-gps"}, new String[]{"gtar", "application/x-gtar"}, new String[]{"gz", "application/x-gzip"}, new String[]{"h", "text/plain"}, new String[]{"hdf", "application/x-hdf"}, new String[]{"hdm", "text/x-hdml"}, new String[]{"hdml", "text/x-hdml"}, new String[]{"hlp", "application/winhlp"}, new String[]{"hqx", "application/mac-binhex40"}, new String[]{"htm", "text/html"}, new String[]{"html", "text/html"}, new String[]{"hts", "text/html"}, new String[]{"ice", "x-conference/x-cooltalk"}, new String[]{"ico", "application/octet-stream"}, new String[]{"ief", "image/ief"}, new String[]{"ifm", "image/gif"}, new String[]{"ifs", "image/ifs"}, new String[]{"imy", "audio/melody"}, new String[]{"ins", "application/x-NET-Install"}, new String[]{"ips", "application/x-ipscript"}, new String[]{"ipx", "application/x-ipix"}, new String[]{"it", "audio/x-mod"}, new String[]{"itz", "audio/x-mod"}, new String[]{"ivr", "i-world/i-vrml"}, new String[]{"j2k", "image/j2k"}, new String[]{"jad", "text/vnd.sun.j2me.app-descriptor"}, new String[]{"jam", "application/x-jam"}, new String[]{"jar", "application/java-archive"}, new String[]{"java", "text/plain"}, new String[]{"jnlp", "application/x-java-jnlp-remover"}, new String[]{"jpe", "image/jpeg"}, new String[]{"jpeg", "image/jpeg"}, new String[]{"jpg", "image/jpeg"}, new String[]{"jpz", "image/jpeg"}, new String[]{"js", "application/x-javascript"}, new String[]{"jwc", "application/jwc"}, new String[]{"kjx", "application/x-kjx"}, new String[]{"lak", "x-lml/x-lak"}, new String[]{"latex", "application/x-latex"}, new String[]{"lcc", "application/fastman"}, new String[]{"lcl", "application/x-digitalloca"}, new String[]{"lcr", "application/x-digitalloca"}, new String[]{"lgh", "application/lgh"}, new String[]{"lha", "application/octet-stream"}, new String[]{"lml", "x-lml/x-lml"}, new String[]{"lmlpack", "x-lml/x-lmlpack"}, new String[]{"log", "text/plain"}, new String[]{"lsf", "video/x-ms-asf"}, new String[]{"lsx", "video/x-ms-asf"}, new String[]{"lzh", "application/x-lzh"}, new String[]{"m13", "application/x-msmediaview"}, new String[]{"m14", "application/x-msmediaview"}, new String[]{"m15", "audio/x-mod"}, new String[]{"m3u", "audio/x-mpegurl"}, new String[]{"m3url", "audio/x-mpegurl"}, new String[]{"m4a", "audio/mp4a-latm"}, new String[]{"m4b", "audio/mp4a-latm"}, new String[]{"m4p", "audio/mp4a-latm"}, new String[]{"m4u", "video/vnd.mpegurl"}, new String[]{"m4v", "video/x-m4v"}, new String[]{"ma1", "audio/ma1"}, new String[]{"ma2", "audio/ma2"}, new String[]{"ma3", "audio/ma3"}, new String[]{"ma5", "audio/ma5"}, new String[]{"man", "application/x-troff-man"}, new String[]{"map", "magnus-internal/imagemap"}, new String[]{"mbd", "application/mbedlet"}, new String[]{"mct", "application/x-mascot"}, new String[]{"mdb", "application/x-msaccess"}, new String[]{"mdz", "audio/x-mod"}, new String[]{"me", "application/x-troff-me"}, new String[]{"mel", "text/x-vmel"}, new String[]{"mi", "application/x-mif"}, new String[]{"mid", "audio/midi"}, new String[]{"midi", "audio/midi"}, new String[]{"mif", "application/x-mif"}, new String[]{"mil", "image/x-cals"}, new String[]{"mio", "audio/x-mio"}, new String[]{"mmf", "application/x-skt-lbs"}, new String[]{"mng", "video/x-mng"}, new String[]{"mny", "application/x-msmoney"}, new String[]{"moc", "application/x-mocha"}, new String[]{"mocha", "application/x-mocha"}, new String[]{"mod", "audio/x-mod"}, new String[]{"mof", "application/x-yumekara"}, new String[]{"mol", "chemical/x-mdl-molfile"}, new String[]{"mop", "chemical/x-mopac-input"}, new String[]{"mov", "video/quicktime"}, new String[]{"movie", "video/x-sgi-movie"}, new String[]{"mp2", "audio/x-mpeg"}, new String[]{"mp3", "audio/x-mpeg"}, new String[]{"mp4", "video/mp4"}, new String[]{"mpc", "application/vnd.mpohun.certificate"}, new String[]{"mpe", "video/mpeg"}, new String[]{"mpeg", "video/mpeg"}, new String[]{"mpg video/mpeg"}, new String[]{"mpg4", "video/mp4"}, new String[]{"mpga", "audio/mpeg"}, new String[]{"mpn", "application/vnd.mophun.application"}, new String[]{"mpp", "application/vnd.ms-project"}, new String[]{"mps", "application/x-mapserver"}, new String[]{"mrl", "text/x-mrml"}, new String[]{"mrm", "application/x-mrm"}, new String[]{"ms", "application/x-troff-ms"}, new String[]{"msg", "application/vnd.ms-outlook"}, new String[]{"mts", "application/metastream"}, new String[]{"mtx", "application/metastream"}, new String[]{"mtz", "application/metastream"}, new String[]{"mzv", "application/metastream"}, new String[]{"nar", "application/zip"}, new String[]{"nbmp", "image/nbmp"}, new String[]{"nc", "application/x-netcdf"}, new String[]{"ndb", "x-lml/x-ndb"}, new String[]{"ndwn", "application/ndwn"}, new String[]{"nif", "application/x-nif"}, new String[]{"nmz", "application/x-scream"}, new String[]{"nokia-op-logo", "image/vnd.nok-oplogo-color"}, new String[]{"npx", "application/x-netfpx"}, new String[]{"nsnd", "audio/nsnd"}, new String[]{"nva", "application/x-neva1"}, new String[]{"oda", "application/oda"}, new String[]{"ogg", "audio/ogg"}, new String[]{"oom", "application/x-AtlasMate-Plugin"}, new String[]{"pac", "audio/x-pac"}, new String[]{"pae", "audio/x-epac"}, new String[]{"pan", "application/x-pan"}, new String[]{"pbm", "image/x-portable-bitmap"}, new String[]{"pcx", "image/x-pcx"}, new String[]{"pda", "image/x-pda"}, new String[]{"pdb", "chemical/x-pdb"}, new String[]{"pdf", "application/pdf"}, new String[]{"pfr", "application/font-tdpfr"}, new String[]{"pgm", "image/x-portable-graymap"}, new String[]{"pict", "image/x-pict"}, new String[]{"pm", "application/x-perl"}, new String[]{"pmd", "application/x-pmd"}, new String[]{"png", "image/png"}, new String[]{"pnm", "image/x-portable-anymap"}, new String[]{"pnz", "image/png"}, new String[]{"pot", "application/vnd.ms-powerpoint"}, new String[]{"ppm", "image/x-portable-pixmap"}, new String[]{"pps", "application/vnd.ms-powerpoint"}, new String[]{"ppt", "application/vnd.ms-powerpoint"}, new String[]{"pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation"}, new String[]{"pqf", "application/x-cprplayer"}, new String[]{"pqi", "application/cprplayer"}, new String[]{"prc", "application/x-prc"}, new String[]{"prop", "text/plain"}, new String[]{"proxy", "application/x-ns-proxy-autoconfig"}, new String[]{"ps", "application/postscript"}, new String[]{"ptlk", "application/listenup"}, new String[]{"pub", "application/x-mspublisher"}, new String[]{"pvx", "video/x-pv-pvx"}, new String[]{"qcp", "audio/vnd.qcelp"}, new String[]{"qt", "video/quicktime"}, new String[]{"qti", "image/x-quicktime"}, new String[]{"qtif", "image/x-quicktime"}, new String[]{"r3t", "text/vnd.rn-realtext3d"}, new String[]{"ra", "audio/x-pn-realaudio"}, new String[]{"ram", "audio/x-pn-realaudio"}, new String[]{"rar", "application/x-rar-compressed"}, new String[]{"ras", "image/x-cmu-raster"}, new String[]{"rc", "text/plain"}, new String[]{"rdf", "application/rdf+xml"}, new String[]{"rf", "image/vnd.rn-realflash"}, new String[]{"rgb", "image/x-rgb"}, new String[]{"rlf", "application/x-richlink"}, new String[]{"rm", "audio/x-pn-realaudio"}, new String[]{"rmf", "audio/x-rmf"}, new String[]{"rmm", "audio/x-pn-realaudio"}, new String[]{"rmvb", "audio/x-pn-realaudio"}, new String[]{"rnx", "application/vnd.rn-realplayer"}, new String[]{"roff", "application/x-troff"}, new String[]{"rp", "image/vnd.rn-realpix"}, new String[]{"rpm", "audio/x-pn-realaudio-plugin"}, new String[]{"rt", "text/vnd.rn-realtext"}, new String[]{"rte", "x-lml/x-gps"}, new String[]{"rtf", "application/rtf"}, new String[]{"rtg", "application/metastream"}, new String[]{"rtx", "text/richtext"}, new String[]{"rv", "video/vnd.rn-realvideo"}, new String[]{"rwc", "application/x-rogerwilco"}, new String[]{"s3m", "audio/x-mod"}, new String[]{"s3z", "audio/x-mod"}, new String[]{"sca", "application/x-supercard"}, new String[]{"scd", "application/x-msschedule"}, new String[]{"sdf", "application/e-score"}, new String[]{"sea", "application/x-stuffit"}, new String[]{"sgm", "text/x-sgml"}, new String[]{"sgml", "text/x-sgml"}, new String[]{"sh", "application/x-sh"}, new String[]{"shar", "application/x-shar"}, new String[]{"shtml", "magnus-internal/parsed-html"}, new String[]{"shw", "application/presentations"}, new String[]{"si6", "image/si6"}, new String[]{"si7", "image/vnd.stiwap.sis"}, new String[]{"si9", "image/vnd.lgtwap.sis"}, new String[]{"sis", "application/vnd.symbian.install"}, new String[]{"sit", "application/x-stuffit"}, new String[]{"skd", "application/x-Koan"}, new String[]{"skm", "application/x-Koan"}, new String[]{"skp", "application/x-Koan"}, new String[]{"skt", "application/x-Koan"}, new String[]{"slc", "application/x-salsa"}, new String[]{"smd", "audio/x-smd"}, new String[]{"smi", "application/smil"}, new String[]{"smil", "application/smil"}, new String[]{"smp", "application/studiom"}, new String[]{"smz", "audio/x-smd"}, new String[]{"snd", "audio/basic"}, new String[]{"spc", "text/x-speech"}, new String[]{"spl", "application/futuresplash"}, new String[]{"spr", "application/x-sprite"}, new String[]{"sprite", "application/x-sprite"}, new String[]{"spt", "application/x-spt"}, new String[]{"src", "application/x-wais-source"}, new String[]{"stk", "application/hyperstudio"}, new String[]{"stm", "audio/x-mod"}, new String[]{"sv4cpio", "application/x-sv4cpio"}, new String[]{"sv4crc", "application/x-sv4crc"}, new String[]{"svf", "image/vnd"}, new String[]{"svg", "image/svg-xml"}, new String[]{"svh", "image/svh"}, new String[]{"svr", "x-world/x-svr"}, new String[]{"swf", "application/x-shockwave-flash"}, new String[]{"swfl", "application/x-shockwave-flash"}, new String[]{"t", "application/x-troff"}, new String[]{"tad", "application/octet-stream"}, new String[]{"talk", "text/x-speech"}, new String[]{"tar", "application/x-tar"}, new String[]{"taz", "application/x-tar"}, new String[]{"tbp", "application/x-timbuktu"}, new String[]{"tbt", "application/x-timbuktu"}, new String[]{"tcl", "application/x-tcl"}, new String[]{"tex", "application/x-tex"}, new String[]{"texi", "application/x-texinfo"}, new String[]{"texinfo", "application/x-texinfo"}, new String[]{"tgz", "application/x-tar"}, new String[]{"thm", "application/vnd.eri.thm"}, new String[]{"tif", "image/tiff"}, new String[]{"tiff", "image/tiff"}, new String[]{"tki", "application/x-tkined"}, new String[]{"tkined", "application/x-tkined"}, new String[]{"toc", "application/toc"}, new String[]{"toy", "image/toy"}, new String[]{"tr", "application/x-troff"}, new String[]{"trk", "x-lml/x-gps"}, new String[]{"trm", "application/x-msterminal"}, new String[]{"tsi", "audio/tsplayer"}, new String[]{"tsp", "application/dsptype"}, new String[]{"tsv", "text/tab-separated-values"}, new String[]{"tsv", "text/tab-separated-values"}, new String[]{"ttf", "application/octet-stream"}, new String[]{"ttz", "application/t-time"}, new String[]{"txt", "text/plain"}, new String[]{"ult", "audio/x-mod"}, new String[]{"ustar", "application/x-ustar"}, new String[]{"uu", "application/x-uuencode"}, new String[]{"uue", "application/x-uuencode"}, new String[]{"vcd", "application/x-cdlink"}, new String[]{"vcf", "text/x-vcard"}, new String[]{"vdo", "video/vdo"}, new String[]{"vib", "audio/vib"}, new String[]{"viv", "video/vivo"}, new String[]{"vivo", "video/vivo"}, new String[]{"vmd", "application/vocaltec-media-desc"}, new String[]{"vmf", "application/vocaltec-media-remover"}, new String[]{"vmi", "application/x-dreamcast-vms-info"}, new String[]{"vms", "application/x-dreamcast-vms"}, new String[]{"vox", "audio/voxware"}, new String[]{"vqe", "audio/x-twinvq-plugin"}, new String[]{"vqf", "audio/x-twinvq"}, new String[]{"vql", "audio/x-twinvq"}, new String[]{"vre", "x-world/x-vream"}, new String[]{"vrml", "x-world/x-vrml"}, new String[]{"vrt", "x-world/x-vrt"}, new String[]{"vrw", "x-world/x-vream"}, new String[]{"vts", "workbook/formulaone"}, new String[]{"wav", "audio/x-wav"}, new String[]{"wax", "audio/x-ms-wax"}, new String[]{"wbmp", "image/vnd.wap.wbmp"}, new String[]{"web", "application/vnd.xara"}, new String[]{"wi", "image/wavelet"}, new String[]{"wis", "application/x-InstallShield"}, new String[]{"wm", "video/x-ms-wm"}, new String[]{"wma", "audio/x-ms-wma"}, new String[]{"wmd", "application/x-ms-wmd"}, new String[]{"wmf", "application/x-msmetafile"}, new String[]{"wml", "text/vnd.wap.wml"}, new String[]{"wmlc", "application/vnd.wap.wmlc"}, new String[]{"wmls", "text/vnd.wap.wmlscript"}, new String[]{"wmlsc", "application/vnd.wap.wmlscriptc"}, new String[]{"wmlscript", "text/vnd.wap.wmlscript"}, new String[]{"wmv", "audio/x-ms-wmv"}, new String[]{"wmx", "video/x-ms-wmx"}, new String[]{"wmz", "application/x-ms-wmz"}, new String[]{"wpng", "image/x-up-wpng"}, new String[]{"wps", "application/vnd.ms-works"}, new String[]{"wpt", "x-lml/x-gps"}, new String[]{"wri", "application/x-mswrite"}, new String[]{"wrl", "x-world/x-vrml"}, new String[]{"wrz", "x-world/x-vrml"}, new String[]{"ws", "text/vnd.wap.wmlscript"}, new String[]{"wsc", "application/vnd.wap.wmlscriptc"}, new String[]{"wv", "video/wavelet"}, new String[]{"wvx", "video/x-ms-wvx"}, new String[]{"wxl", "application/x-wxl"}, new String[]{"x-gzip", "application/x-gzip"}, new String[]{"xar", "application/vnd.xara"}, new String[]{"xbm", "image/x-xbitmap"}, new String[]{"xdm", "application/x-xdma"}, new String[]{"xdma", "application/x-xdma"}, new String[]{"xdw", "application/vnd.fujixerox.docuworks"}, new String[]{"xht", "application/xhtml+xml"}, new String[]{"xhtm", "application/xhtml+xml"}, new String[]{"xhtml", "application/xhtml+xml"}, new String[]{"xla", "application/vnd.ms-excel"}, new String[]{"xlc", "application/vnd.ms-excel"}, new String[]{"xll", "application/x-excel"}, new String[]{"xlm", "application/vnd.ms-excel"}, new String[]{"xls", "application/vnd.ms-excel"}, new String[]{"xlt", "application/vnd.ms-excel"}, new String[]{"xlw", "application/vnd.ms-excel"}, new String[]{"xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"}, new String[]{"xm", "audio/x-mod"}, new String[]{"xml", "text/xml"}, new String[]{"xmz", "audio/x-mod"}, new String[]{"xpi", "application/x-xpinstall"}, new String[]{"xpm", "image/x-xpixmap"}, new String[]{"xsit", "text/xml"}, new String[]{"xsl", "text/xml"}, new String[]{"xul", "text/xul"}, new String[]{"xwd", "image/x-xwindowdump"}, new String[]{"xyz", "chemical/x-pdb"}, new String[]{"yz1", "application/x-yz1"}, new String[]{"z", "application/x-compress"}, new String[]{"zac", "application/x-zaurus-zac"}, new String[]{"zip", "application/zip"}, new String[]{"", "*/*"}};

    /* renamed from: a */
    public static String getType(File file) {
        String str = "*/*";
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf < 0) {
            return str;
        }
        String lowerCase = name.substring(lastIndexOf + 1).toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            return str;
        }
        String str2 = str;
        for (int i = 0; i < listOpen.length; i++) {
            if (lowerCase.equals(listOpen[i][0])) {
                str2 = listOpen[i][1];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mime remover type : ");
        sb.append(str2);
        return str2;
    }

}
