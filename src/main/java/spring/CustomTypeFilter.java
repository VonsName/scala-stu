package spring;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.lang.annotation.Annotation;

/**
 * @author ： fjl
 * @date ： 2019/3/27/027 10:03
 */
public class CustomTypeFilter implements TypeFilter {

    public CustomTypeFilter() {
    }

    private Class<? extends Annotation> clazz;

    public CustomTypeFilter(Class<? extends Annotation> clazz) {
        this.clazz = clazz;
    }

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        return (annotationMetadata.hasAnnotation(clazz.getName()) || annotationMetadata.hasMetaAnnotation(clazz.getName()));
    }
}
