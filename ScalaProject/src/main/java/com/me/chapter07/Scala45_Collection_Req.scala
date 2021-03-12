package com.atguigu.bigdata.scala.chapter07

object Scala45_Collection_Req {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 不同省份商品点击排行
        val dataList = List(
            ("zhangsan", "河北", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "鞋"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "鞋"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "鞋"),
            ("zhangsan", "河北", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "帽子"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "电脑"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "电脑"),
            ("zhangsan", "河南", "电脑"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子")
        )

        // TODO 将数据中多余的内容去除掉，提供访问效率
        //      转换数据的结构，方便统计
        // ("wangwu", "河北", "帽子") => ("河北", "帽子") => "河北-帽子"
        val list = dataList.map(
            t => {
                t._2 + "-" + t._3
            }
        )

        // TODO 将数据进行分组后再统计
        // "河北-帽子" => ("河北-帽子", count)
        val groupMap: Map[String, List[String]] = list.groupBy(data=>data)
        val dataToCountMap: Map[String, Int] = groupMap.mapValues(_.size)
        //println(dataToCountMap)
        // TODO 将数据结构进行转换
        // ("河北-帽子", count) => ("河北", (帽子,count))
        val prvToItemCountList: List[(String, (String, Int))] = dataToCountMap.toList.map(
            kv => {
                val key = kv._1
                val count = kv._2

                val ks = key.split("-")

                (ks(0), (ks(1), count))
            }
        )

        // TODO 将转换结构后的数据根据省份进行分组
        val prvGroupMap: Map[String, List[(String, (String, Int))]] = prvToItemCountList.groupBy(_._1)

        // TODO 将分组后的数据进行商品点击的排序处理
        val result = prvGroupMap.mapValues(
            list => {
                val itemToCountList: List[(String, Int)] = list.map(_._2)
                itemToCountList.sortWith(
                    (left, right) => {
                        left._2 > right._2
                    }
                )
            }
        )

        println(result)



    }
}
