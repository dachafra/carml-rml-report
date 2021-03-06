package es.upm.fi.dia.oeg.rmlreport.CARML;

import com.taxonic.carml.engine.RmlMapper;
import com.taxonic.carml.logical_source_resolver.XPathResolver;
import com.taxonic.carml.vocab.Rdf;

import java.io.*;
import java.util.logging.Logger;

public class XMLTestCARML {

    private final static Logger LOG = Logger.getLogger("oeg.dia.fi.upm.es.XMLTestCARML");

    public static RmlMapper GetMapper(File dirTest) {


        RmlMapper mapper = RmlMapper.newBuilder()
                .setLogicalSourceResolver(Rdf.Ql.XPath, new XPathResolver())
                // set file directory for sources in mapping
                .fileResolver(dirTest.toPath())
                // set classpath basepath for sources in mapping
                //.classPathResolver(dirTest.getAbsolutePath())
                .build();
        return mapper;

    }


}
