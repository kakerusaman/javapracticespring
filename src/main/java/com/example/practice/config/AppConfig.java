package com.example.practice.config;

import org.springframework.context.annotation.Configuration;

/*
@Configurationはそのクラスが設定クラスであることを示しています。
このクラスの中で@Beanアノテーションなどをつかい、Springコンテナ（DIコンテナ）に登録したいオブジェクト（Bean）の生成や記述方法を定義します。
@ConfigurationがついたクラスはSpringによって実行時に読み込まれてアプリケーションの設定や依存性の注入を行います。
*/ 

@Configuration
public class AppConfig {
    
}
