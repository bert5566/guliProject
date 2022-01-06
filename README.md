# guliProject
谷粒商城項目

技術涵蓋簡介：微服務架構 + 前後台 + 分布式  + 集群 + 部署 + 自動化維運+ 可視化CICD。

業務集群系統+后台管理系统構成，打通了分布式開發及全端開發技能，包含前後分離全端開發、Restful接口、數據校驗、gateway、註冊發現、配置中心、融斷機制、限流、降级、鏈路追蹤、性能監控、壓力測試、系統預警、集群部署、持續集成、持續部署…

-------------------------------------------------------------------------------------------------------------------------------------------------------
【分布式_全端開發篇】
使用SpringBoot+Vue+element-ui+逆向工程搭建全套后台管理系统，基于Docker環境，通過前後分離方式打造。

【分布式_微服務架構篇】
開發整個商城系統，掌握微服務全套方案。使用 SpringBoot+SpringCloud 並引入 SpringCloud Alibaba 系列，
引入全套微服務治理方案：
    Nacos 註冊中心/
    配置中心、Sentinel /
    流量保護系统、Seata /
    分布式事务&RabbitMQ 柔性事務方案 / 
    SpringCloud-Gateway /
    Feign 遠程調用 / 
    Sleuth+Zipkin 鏈路追蹤系統 /
    Spring Cache 緩存 /
    SpringSession 跨子域 Session同步方案 /
    基於 ElasticSearch7 全文檢索 / 
    異步編排與連線池 /
    壓力測試調優 /
    Redisson 分布式鎖 /
    分布式信號量等。


【高可用集群】
基於 kubernetes 集群，整合 kubesphere 可視化界面，搭建全套系统環境。
使用集群化部署 : 
    包括Redis Cluster集群/
    MySQL主從架構與分庫分表(使用ShardingSphere完成)集群 / 
    RabbitMQ 鏡像列隊集群 / 
    ElasticSearch高可用集群。
 基于kubesphere整合Jenkins全可视化CICD，全套Pipeline流水線編寫。
