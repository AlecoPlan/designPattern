package com.proxy;

import java.io.IOException;

/**
 * @author wzy
 * @creats 2020-11-06-0:12
 */
public class Proxy {

//    public static Object newProxyInstance() throws IOException {
//        TypeSpec.Builder typeSpecBuilder = TypeSpec.classBuilder("TimeProxy")
//                .addSuperinterface(Flyable.class);
//
//        FieldSpec fieldSpec = FieldSpec.builder(Flyable.class, "flyable", Modifier.PRIVATE).build();
//        typeSpecBuilder.addField(fieldSpec);
//
//        MethodSpec constructorMethodSpec = MethodSpec.constructorBuilder()
//                .addModifiers(Modifier.PUBLIC)
//                .addParameter(Flyable.class, "flyable")
//                .addStatement("this.flyable = flyable")
//                .build();
//        typeSpecBuilder.addMethod(constructorMethodSpec);
//
//        Method[] methods = Flyable.class.getDeclaredMethods();
//        for (Method method : methods) {
//            MethodSpec methodSpec = MethodSpec.methodBuilder(method.getName())
//                    .addModifiers(Modifier.PUBLIC)
//                    .addAnnotation(Override.class)
//                    .returns(method.getReturnType())
//                    .addStatement("long start = $T.currentTimeMillis()", System.class)
//                    .addCode("\n")
//                    .addStatement("this.flyable." + method.getName() + "()")
//                    .addCode("\n")
//                    .addStatement("long end = $T.currentTimeMillis()", System.class)
//                    .addStatement("$T.out.println(\"Fly Time =\" + (end - start))", System.class)
//                    .build();
//            typeSpecBuilder.addMethod(methodSpec);
//        }
//
//        JavaFile javaFile = JavaFile.builder("com.youngfeng.proxy", typeSpecBuilder.build()).build();
//        // 为了看的更清楚，我将源码文件生成到桌面
//        javaFile.writeTo(new File("/Users/ouyangfeng/Desktop/"));
//
//        return null;
//    }

}
