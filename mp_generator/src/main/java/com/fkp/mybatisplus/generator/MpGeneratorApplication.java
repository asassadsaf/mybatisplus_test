package com.fkp.mybatisplus.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class MpGeneratorApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MpGeneratorApplication.class, args);
        ParamsProperties paramsProperties = run.getBean(ParamsProperties.class);
        generate(paramsProperties);
    }

    private static void generate(ParamsProperties paramsProperties){

        ParamsProperties.DataSourceProperties dataSourceProperties = paramsProperties.dataSourceProperties;
        ParamsProperties.ConfigProperties configProperties = paramsProperties.configProperties;

        MySqlTypeConvert mySqlTypeConvert = new MySqlTypeConvert();
        MySqlKeyWordsHandler mySqlKeyWordsHandler = new MySqlKeyWordsHandler();

        DataSourceConfig dataSourceConfig = new DataSourceConfig
                .Builder(dataSourceProperties.getUrl(), dataSourceProperties.getUsername(), dataSourceProperties.getPassword())
                .typeConvert(mySqlTypeConvert)
                .keyWordsHandler(mySqlKeyWordsHandler)
                .build();

        GlobalConfig globalConfig = new GlobalConfig.Builder()
                .author(configProperties.getAuthor())     // 设置作者
                .enableSwagger()    // 开启 swagger 模式
                .outputDir(configProperties.getOutPutDir())   // 指定输出目录
                .dateType(DateType.ONLY_DATE)   //指定TypeConverter中时间格式转换为哪个包下的java时间类
                .disableOpenDir()
                .build();

        PackageConfig packageConfig = new PackageConfig.Builder()
                .parent(configProperties.getParentPackage())  //指定父包
                .xml("xml")     //指定mapper xml包
                .build();


        StrategyConfig strategyConfig = new StrategyConfig.Builder()
                .addInclude(configProperties.getTableNames())
                .entityBuilder()
                .enableLombok()
                .mapperBuilder()
                .enableBaseResultMap()
                .enableBaseColumnList()
                .build();

        TemplateConfig templateConfig = new TemplateConfig.Builder()
                .entity("/template/entity.java")
                .disable(TemplateType.SERVICE)
                .disable(TemplateType.CONTROLLER)
                .disable(TemplateType.SERVICEIMPL)
                .build();

        AutoGenerator autoGenerator = new AutoGenerator(dataSourceConfig)
                .global(globalConfig)
                .packageInfo(packageConfig)
                .strategy(strategyConfig)
                .template(templateConfig);

        autoGenerator.execute(new FreemarkerTemplateEngine());

    }

}
