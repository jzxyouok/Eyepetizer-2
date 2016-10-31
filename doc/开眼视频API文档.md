##	<center>开眼视频API文档
###	1、搜索Api
####	1.热门搜索(http://baobab.wandoujia.com/api/v3/queries/hot)
返回结果：

```json
[
  "脱口秀",
  "城会玩",
  "666",
  "笑cry",
  "漫威",
  "清新",
  "匠心",
  "VR",
  "心理学",
  "舞蹈",
  "品牌广告",
  "粉丝自制",
  "电影相关",
  "萝莉",
  "魔性",
  "第一视角",
  "教程",
  "毕业设计",
  "奥斯卡",
  "燃",
  "冰与火之歌",
  "温情",
  "线下campaign",
  "公益"
```
####	2.关键词搜索(http://baobab.wandoujia.com/api/v1/search?num=1&query=清新&start=0)
参数说明：
|参数|说明|备注|
|:------:|:------:|:-----:|
|num|返回个数|整数，一般设置为10|
|query|搜索关键字|字符串，key|
|start|开始位置|整数，一般从0开始|
返回结果：
```json
{
  "itemList": [
    {
      "type": "video",
      "data": {
        "dataType": "VideoBeanForClient",
        "id": 1686,
        "title": "Owl City 夏日清凉新曲",
        "description": "小清新的电子音乐人 Owl City 7 月发行了新专辑，新歌「Unbelievable」是一支动画 MV，复古简单的画风，依然透着那么一股清新的味道。From OwlCityVEVO",
        "provider": {
          "name": "YouTube",
          "alias": "youtube",
          "icon": "http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"
        },
        "category": "音乐",
        "author": null,
        "cover": {
          "feed": "http://img.kaiyanapp.com/47f4b9e3229453e2af9397280ccac5c7.jpeg",
          "detail": "http://img.kaiyanapp.com/47f4b9e3229453e2af9397280ccac5c7.jpeg",
          "blurred": "http://img.kaiyanapp.com/f1ec2f16945f0cb68937cc033c588008.jpeg",
          "sharing": null
        },
        "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=1686&editionType=default",
        "duration": 204,
        "webUrl": {
          "raw": "http://www.eyepetizer.net/detail.html?vid=1686",
          "forWeibo": "http://wandou.im/l0cgm"
        },
        "releaseTime": 1436371200000,
        "playInfo": [
          {
            "height": 480,
            "width": 720,
            "name": "标清",
            "type": "normal",
            "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=1686&editionType=normal"
          },
          {
            "height": 720,
            "width": 1280,
            "name": "高清",
            "type": "high",
            "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=1686&editionType=high"
          }
        ],
        "consumption": {
          "collectionCount": 2174,
          "shareCount": 1495,
          "replyCount": 4
        },
        "campaign": null,
        "waterMarks": null,
        "adTrack": null,
        "tags": [
          {
            "id": 18,
            "name": "音乐",
            "actionUrl": "eyepetizer://tag/18/?title=%E9%9F%B3%E4%B9%90",
            "adTrack": null
          },
          {
            "id": 14,
            "name": "动画",
            "actionUrl": "eyepetizer://tag/14/?title=%E5%8A%A8%E7%94%BB",
            "adTrack": null
          }
        ],
        "type": "NORMAL",
        "idx": 0,
        "shareAdTrack": null,
        "favoriteAdTrack": null,
        "webAdTrack": null,
        "date": 1436371200000,
        "promotion": null,
        "label": null,
        "collected": false,
        "played": false
      }
    }
  ],
  "count": 1,
  "total": 122,
  "nextPageUrl": "http://baobab.kaiyanapp.com/api/v1/search?start=1&num=1&query=%E6%B8%85%E6%96%B0"
}
```
###	3、每日视频Api
####	1.今日视频(http://baobab.wandoujia.com/api/v2/feed?num=2)
参数说明：
|参数|说明|备注|
|:------:|:-------:|:-------:|
|num|返回几天的视频|以今天为基准，往前推num天|
返回结果：
```json
{
  "issueList": [
    {
      "releaseTime": 1477584000000,
      "type": "normal",
      "date": 1477584000000,
      "publishTime": 1477584000000,
      "itemList": [
        {
          "type": "video",
          "data": {
            "dataType": "VideoBeanForClient",
            "id": 10658,
            "title": "特条丨苹果新款 MacBook Pro：QWERTY",
            "description": "新款 MacBook Pro 的广告片「QWERTY」重点展示了 Muti-Touch Bar，对于剪辑师和日常操作都有增益。不过，苹果的广告，主要是听歌，对吧~From Apple",
            "provider": {
              "name": "YouTube",
              "alias": "youtube",
              "icon": "http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"
            },
            "category": "广告",
            "author": null,
            "cover": {
              "feed": "http://img.kaiyanapp.com/c9ae33f38b34988d7e0bbc04d6159e17.jpeg?imageMogr2/quality/60",
              "detail": "http://img.kaiyanapp.com/c9ae33f38b34988d7e0bbc04d6159e17.jpeg?imageMogr2/quality/60",
              "blurred": "http://img.kaiyanapp.com/a409cdff754a941eef83ba38db0e33fa.jpeg?imageMogr2/quality/60",
              "sharing": null
            },
            "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10658&editionType=default",
            "duration": 32,
            "webUrl": {
              "raw": "http://www.eyepetizer.net/detail.html?vid=10658",
              "forWeibo": "http://wandou.im/38bdfx"
            },
            "releaseTime": 1477626255000,
            "playInfo": [
              {
                "height": 480,
                "width": 854,
                "name": "标清",
                "type": "normal",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10658&editionType=normal"
              },
              {
                "height": 720,
                "width": 1280,
                "name": "高清",
                "type": "high",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10658&editionType=high"
              }
            ],
            "consumption": {
              "collectionCount": 174,
              "shareCount": 611,
              "replyCount": 13
            },
            "campaign": null,
            "waterMarks": null,
            "adTrack": null,
            "tags": [],
            "type": "NORMAL",
            "idx": 0,
            "shareAdTrack": null,
            "favoriteAdTrack": null,
            "webAdTrack": null,
            "date": 1477584000000,
            "promotion": null,
            "label": null,
            "collected": false,
            "played": false
          }
        }
        }
      ],
      "count": 9
    }
  ],
  "nextPageUrl": "http://baobab.kaiyanapp.com/api/v2/feed?date=1477497600000&num=1",
  "nextPublishTime": 1477670400000,
  "newestIssueType": "normal",
  "dialog": null
}
```
####	2.具体某一天的视频(http://baobab.wandoujia.com/api/v2/feed?num=1&date=1477497600000)
参数说明：
|参数|说明|备注|
|:------:|:------:|:------:|
|num|返回几天的视频|整数|
|date|指定的日期|long,毫秒值|
返回结果：
```json
{
  "issueList": [
    {
      "releaseTime": 1477497600000,
      "type": "normal",
      "date": 1477497600000,
      "publishTime": 1477497600000,
      "itemList": [
        {
          "type": "textHeader",
          "data": {
            "dataType": "TextHeader",
            "text": "- Oct. 27 -",
            "font": "lobster",
            "adTrack": null
          }
        },
        {
          "type": "video",
          "data": {
            "dataType": "VideoBeanForClient",
            "id": 10588,
            "title": "特条丨微软炫酷 Surface 设计工作站",
            "description": "Surface Studio 这则宣传片仿佛让大家看到了「黑镜」般的科技体验，新产品搭配全新外设 Surface Dial，让取色旋转等日常操作貌似更顺畅。（我不会告诉你是因为 BGM：Pure Imagination 和剪辑的功劳）。From Surface",
            "provider": {
              "name": "YouTube",
              "alias": "youtube",
              "icon": "http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"
            },
            "category": "创意",
            "author": null,
            "cover": {
              "feed": "http://img.kaiyanapp.com/130cd3481576ea44cd54bc2f0a34a145.jpeg?imageMogr2/quality/60",
              "detail": "http://img.kaiyanapp.com/130cd3481576ea44cd54bc2f0a34a145.jpeg?imageMogr2/quality/60",
              "blurred": "http://img.kaiyanapp.com/eab002b8a10c4b2353d3b6791bc893d0.jpeg?imageMogr2/quality/60",
              "sharing": null
            },
            "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10588&editionType=default",
            "duration": 133,
            "webUrl": {
              "raw": "http://www.eyepetizer.net/detail.html?vid=10588",
              "forWeibo": "http://wandou.im/383ar1"
            },
            "releaseTime": 1477537508000,
            "playInfo": [
              {
                "height": 720,
                "width": 1280,
                "name": "高清",
                "type": "high",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10588&editionType=high"
              }
            ],
            "consumption": {
              "collectionCount": 1379,
              "shareCount": 3857,
              "replyCount": 68
            },
            "campaign": null,
            "waterMarks": null,
            "adTrack": null,
            "tags": [],
            "type": "NORMAL",
            "idx": 0,
            "shareAdTrack": null,
            "favoriteAdTrack": null,
            "webAdTrack": null,
            "date": 1477497600000,
            "promotion": null,
            "label": null,
            "collected": false,
            "played": false
          }
        },
      ],
      "count": 10
    },
    {
      "releaseTime": 1477411200000,
      "type": "normal",
      "date": 1477411200000,
      "publishTime": 1477411200000,
      "itemList": [
        {
          "type": "textHeader",
          "data": {
            "dataType": "TextHeader",
            "text": "- Oct. 26 -",
            "font": "lobster",
            "adTrack": null
          }
        },
        {
          "type": "video",
          "data": {
            "dataType": "VideoBeanForClient",
            "id": 10558,
            "title": "特条丨「蜡笔小新」最新剧场版",
            "description": "「蜡笔小新：梦境世界大突击」2016 年的再次回归！屁屁神功这次又大显神威，小新不仅用它解救了危机中的风间，还拿来与恶势力作斗争。影片将于 11 月 4 日登陆内地院线，你的童年是被他带坏的么？",
            "provider": {
              "name": "投稿",
              "alias": "PGC2",
              "icon": ""
            },
            "category": "预告",
            "author": null,
            "cover": {
              "feed": "http://img.kaiyanapp.com/4503d6608c63bd67127f1605e9f36a16.jpeg?imageMogr2/quality/60",
              "detail": "http://img.kaiyanapp.com/4503d6608c63bd67127f1605e9f36a16.jpeg?imageMogr2/quality/60",
              "blurred": "http://img.kaiyanapp.com/7d48ade56e9e04470fdaf06fa478f056.jpeg?imageMogr2/quality/60",
              "sharing": null
            },
            "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10558&editionType=default",
            "duration": 90,
            "webUrl": {
              "raw": "http://www.eyepetizer.net/detail.html?vid=10558",
              "forWeibo": "http://wandou.im/37vxr9"
            },
            "releaseTime": 1477460779000,
            "playInfo": [],
            "consumption": {
              "collectionCount": 188,
              "shareCount": 542,
              "replyCount": 11
            },
            "campaign": null,
            "waterMarks": null,
            "adTrack": null,
            "tags": [
              {
                "id": 22,
                "name": "预告",
                "actionUrl": "eyepetizer://tag/22/?title=%E9%A2%84%E5%91%8A",
                "adTrack": null
              },
              {
                "id": 14,
                "name": "动画",
                "actionUrl": "eyepetizer://tag/14/?title=%E5%8A%A8%E7%94%BB",
                "adTrack": null
              }
            ],
            "type": "NORMAL",
            "idx": 0,
            "shareAdTrack": null,
            "favoriteAdTrack": null,
            "webAdTrack": null,
            "date": 1477411200000,
            "promotion": null,
            "label": null,
            "collected": false,
            "played": false
          }
        },
        {
          "type": "video",
          "data": {
            "dataType": "VideoBeanForClient",
            "id": 10472,
            "title": "360°午夜巴黎全景延时影片",
            "description": "360°午夜巴黎全景延时影片 「MIDNIGHT IN PARIS」。From  All VR Films",
            "provider": {
              "name": "PGC",
              "alias": "PGC",
              "icon": ""
            },
            "category": "旅行",
            "author": {
              "id": 270,
              "icon": "http://img.kaiyanapp.com/8b2e623be7f5956fd60fc2986bafab74.jpeg?imageMogr2/quality/60",
              "name": "All VR Films",
              "description": "All VR Films ∣ 来自巴黎的360°VR影像制作公司.",
              "link": "",
              "latestReleaseTime": 1477456388000,
              "videoNum": 4,
              "adTrack": null
            },
            "cover": {
              "feed": "http://img.kaiyanapp.com/7fde6a34e10320df85d795246a2877bd.jpeg?imageMogr2/quality/60",
              "detail": "http://img.kaiyanapp.com/7fde6a34e10320df85d795246a2877bd.jpeg?imageMogr2/quality/60",
              "blurred": "http://img.kaiyanapp.com/3db7994148afff806be9e5c177fb79d7.jpeg?imageMogr2/quality/60",
              "sharing": null
            },
            "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10472&editionType=default",
            "duration": 130,
            "webUrl": {
              "raw": "http://www.eyepetizer.net/detail.html?vid=10472",
              "forWeibo": "http://wandou.im/37gy73"
            },
            "releaseTime": 1477411763000,
            "playInfo": [
              {
                "height": 480,
                "width": 854,
                "name": "标清",
                "type": "normal",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10472&editionType=normal"
              },
              {
                "height": 1080,
                "width": 2160,
                "name": "高清",
                "type": "high",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10472&editionType=high"
              }
            ],
            "consumption": {
              "collectionCount": 1227,
              "shareCount": 2903,
              "replyCount": 32
            },
            "campaign": null,
            "waterMarks": null,
            "adTrack": null,
            "tags": [
              {
                "id": 658,
                "name": "360°全景",
                "actionUrl": "eyepetizer://tag/658/?title=360%C2%B0%E5%85%A8%E6%99%AF",
                "adTrack": null
              },
              {
                "id": 370,
                "name": "欧洲",
                "actionUrl": "eyepetizer://tag/370/?title=%E6%AC%A7%E6%B4%B2",
                "adTrack": null
              },
              {
                "id": 10,
                "name": "旅行",
                "actionUrl": "eyepetizer://tag/10/?title=%E6%97%85%E8%A1%8C",
                "adTrack": null
              },
              {
                "id": 78,
                "name": "延时",
                "actionUrl": "eyepetizer://tag/78/?title=%E5%BB%B6%E6%97%B6",
                "adTrack": null
              }
            ],
            "type": "PANORAMIC",
            "idx": 0,
            "shareAdTrack": null,
            "favoriteAdTrack": null,
            "webAdTrack": null,
            "date": 1477411200000,
            "promotion": null,
            "label": {
              "text": "360°全景"
            },
            "collected": false,
            "played": false
          }
        },
        {
          "type": "video",
          "data": {
            "dataType": "VideoBeanForClient",
            "id": 10404,
            "title": "梦工厂新作：「老板宝宝」预告",
            "description": "如果有一天你的地位被「二胎宝宝」所动摇... 小 Tim 的父母带回来一个小孩子，告诉那将会是他的弟弟，小 Tim 却发现这个小弟弟竟然会讲话，而且他居然是个老板！本片将在 2017 年上映。From Movieclips Trailers",
            "provider": {
              "name": "YouTube",
              "alias": "youtube",
              "icon": "http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"
            },
            "category": "预告",
            "author": null,
            "cover": {
              "feed": "http://img.kaiyanapp.com/d4f136fbdd7fc3c5628b321278952f48.jpeg?imageMogr2/quality/60",
              "detail": "http://img.kaiyanapp.com/d4f136fbdd7fc3c5628b321278952f48.jpeg?imageMogr2/quality/60",
              "blurred": "http://img.kaiyanapp.com/14374e5ad6bc03e8ba8f56a461ef34df.jpeg?imageMogr2/quality/60",
              "sharing": null
            },
            "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10404&editionType=default",
            "duration": 119,
            "webUrl": {
              "raw": "http://www.eyepetizer.net/detail.html?vid=10404",
              "forWeibo": "http://wandou.im/36mbss"
            },
            "releaseTime": 1477411200000,
            "playInfo": [
              {
                "height": 480,
                "width": 854,
                "name": "标清",
                "type": "normal",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10404&editionType=normal"
              },
              {
                "height": 720,
                "width": 1280,
                "name": "高清",
                "type": "high",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10404&editionType=high"
              }
            ],
            "consumption": {
              "collectionCount": 630,
              "shareCount": 1525,
              "replyCount": 28
            },
            "campaign": null,
            "waterMarks": null,
            "adTrack": null,
            "tags": [
              {
                "id": 22,
                "name": "预告",
                "actionUrl": "eyepetizer://tag/22/?title=%E9%A2%84%E5%91%8A",
                "adTrack": null
              },
              {
                "id": 14,
                "name": "动画",
                "actionUrl": "eyepetizer://tag/14/?title=%E5%8A%A8%E7%94%BB",
                "adTrack": null
              },
              {
                "id": 418,
                "name": "梦工厂",
                "actionUrl": "eyepetizer://tag/418/?title=%E6%A2%A6%E5%B7%A5%E5%8E%82",
                "adTrack": null
              },
              {
                "id": 56,
                "name": "3D",
                "actionUrl": "eyepetizer://tag/56/?title=3D",
                "adTrack": null
              },
              {
                "id": 498,
                "name": "萌",
                "actionUrl": "eyepetizer://tag/498/?title=%E8%90%8C",
                "adTrack": null
              },
              {
                "id": 140,
                "name": "搞笑",
                "actionUrl": "eyepetizer://tag/140/?title=%E6%90%9E%E7%AC%91",
                "adTrack": null
              }
            ],
            "type": "NORMAL",
            "idx": 0,
            "shareAdTrack": null,
            "favoriteAdTrack": null,
            "webAdTrack": null,
            "date": 1477411200000,
            "promotion": null,
            "label": null,
            "collected": false,
            "played": false
          }
        },
        {
          "type": "video",
          "data": {
            "dataType": "VideoBeanForClient",
            "id": 10552,
            "title": "粉丝自制「精灵宝可梦」广告",
            "description": "这部「Pokémon: Evolutions - Sun and Moon Commercial」作为粉丝自己的广告质量很不错。你进化了，我们也是。满满情怀，大家纷纷表示那个在被子里的小孩就是自己！From John Wikstrom",
            "provider": {
              "name": "YouTube",
              "alias": "youtube",
              "icon": "http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"
            },
            "category": "游戏",
            "author": null,
            "cover": {
              "feed": "http://img.kaiyanapp.com/bc01f07920879737c42e685d9d2f9234.jpeg?imageMogr2/quality/60",
              "detail": "http://img.kaiyanapp.com/bc01f07920879737c42e685d9d2f9234.jpeg?imageMogr2/quality/60",
              "blurred": "http://img.kaiyanapp.com/2e79b9a262b739f1e30b81a847907ef8.jpeg?imageMogr2/quality/60",
              "sharing": null
            },
            "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10552&editionType=default",
            "duration": 71,
            "webUrl": {
              "raw": "http://www.eyepetizer.net/detail.html?vid=10552",
              "forWeibo": "http://wandou.im/37r8bf"
            },
            "releaseTime": 1477411200000,
            "playInfo": [
              {
                "height": 480,
                "width": 854,
                "name": "标清",
                "type": "normal",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10552&editionType=normal"
              },
              {
                "height": 538,
                "width": 1280,
                "name": "高清",
                "type": "high",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10552&editionType=high"
              }
            ],
            "consumption": {
              "collectionCount": 247,
              "shareCount": 260,
              "replyCount": 12
            },
            "campaign": null,
            "waterMarks": null,
            "adTrack": null,
            "tags": [
              {
                "id": 42,
                "name": "粉丝自制",
                "actionUrl": "eyepetizer://tag/42/?title=%E7%B2%89%E4%B8%9D%E8%87%AA%E5%88%B6",
                "adTrack": null
              },
              {
                "id": 30,
                "name": "游戏",
                "actionUrl": "eyepetizer://tag/30/?title=%E6%B8%B8%E6%88%8F",
                "adTrack": null
              },
              {
                "id": 16,
                "name": "广告",
                "actionUrl": "eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A",
                "adTrack": null
              },
              {
                "id": 536,
                "name": "情怀",
                "actionUrl": "eyepetizer://tag/536/?title=%E6%83%85%E6%80%80",
                "adTrack": null
              }
            ],
            "type": "NORMAL",
            "idx": 0,
            "shareAdTrack": null,
            "favoriteAdTrack": null,
            "webAdTrack": null,
            "date": 1477411200000,
            "promotion": null,
            "label": null,
            "collected": false,
            "played": false
          }
        },
        {
          "type": "video",
          "data": {
            "dataType": "VideoBeanForClient",
            "id": 10494,
            "title": "日本市长们体验孕妇生活",
            "description": "三名日本知名知事（政务长官）身穿 7.3 公斤重的“假肚子马甲”，体验怀孕 7 个月孕妇的生活，包括做家务、购物等等。其实有机会让男人们体验一会生孩子也许更震撼吧！妈妈万岁！老婆万岁！ From chanchanko",
            "provider": {
              "name": "YouTube",
              "alias": "youtube",
              "icon": "http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"
            },
            "category": "广告",
            "author": null,
            "cover": {
              "feed": "http://img.kaiyanapp.com/c467c751c567de9f973ed319a8993a18.jpeg?imageMogr2/quality/60",
              "detail": "http://img.kaiyanapp.com/c467c751c567de9f973ed319a8993a18.jpeg?imageMogr2/quality/60",
              "blurred": "http://img.kaiyanapp.com/4c6e810b06d55d39f03446eff7631e31.jpeg?imageMogr2/quality/60",
              "sharing": null
            },
            "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10494&editionType=default",
            "duration": 180,
            "webUrl": {
              "raw": "http://www.eyepetizer.net/detail.html?vid=10494",
              "forWeibo": "http://wandou.im/37izcu"
            },
            "releaseTime": 1477411200000,
            "playInfo": [
              {
                "height": 480,
                "width": 854,
                "name": "标清",
                "type": "normal",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10494&editionType=normal"
              },
              {
                "height": 720,
                "width": 1280,
                "name": "高清",
                "type": "high",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10494&editionType=high"
              }
            ],
            "consumption": {
              "collectionCount": 252,
              "shareCount": 784,
              "replyCount": 16
            },
            "campaign": null,
            "waterMarks": null,
            "adTrack": null,
            "tags": [
              {
                "id": 16,
                "name": "广告",
                "actionUrl": "eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A",
                "adTrack": null
              },
              {
                "id": 384,
                "name": "日本广告",
                "actionUrl": "eyepetizer://tag/384/?title=%E6%97%A5%E6%9C%AC%E5%B9%BF%E5%91%8A",
                "adTrack": null
              },
              {
                "id": 110,
                "name": "亲情",
                "actionUrl": "eyepetizer://tag/110/?title=%E4%BA%B2%E6%83%85",
                "adTrack": null
              },
              {
                "id": 40,
                "name": "公益",
                "actionUrl": "eyepetizer://tag/40/?title=%E5%85%AC%E7%9B%8A",
                "adTrack": null
              }
            ],
            "type": "NORMAL",
            "idx": 0,
            "shareAdTrack": null,
            "favoriteAdTrack": null,
            "webAdTrack": null,
            "date": 1477411200000,
            "promotion": null,
            "label": null,
            "collected": false,
            "played": false
          }
        },
        {
          "type": "video",
          "data": {
            "dataType": "VideoBeanForClient",
            "id": 10556,
            "title": "圆滚滚的长颈鹿",
            "description": "「ROLLIN' WILD」系列居然更新了！搜「圆滚滚」就可看到之前的合集啦~这只站在猴面包树前的长颈鹿是如何生存艰难的呢（明明树里有水呀~）？周边链接，无责任种草：http://www.rollinwild.com/shop.php",
            "provider": {
              "name": "YouTube",
              "alias": "youtube",
              "icon": "http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"
            },
            "category": "动画",
            "author": null,
            "cover": {
              "feed": "http://img.kaiyanapp.com/6b1a07e68563eed649e71b43d6e9ea82.jpeg?imageMogr2/quality/60",
              "detail": "http://img.kaiyanapp.com/6b1a07e68563eed649e71b43d6e9ea82.jpeg?imageMogr2/quality/60",
              "blurred": "http://img.kaiyanapp.com/a2ec12108fc9b114fe96d1be5995e9cd.jpeg?imageMogr2/quality/60",
              "sharing": null
            },
            "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10556&editionType=default",
            "duration": 40,
            "webUrl": {
              "raw": "http://www.eyepetizer.net/detail.html?vid=10556",
              "forWeibo": "http://wandou.im/37rco9"
            },
            "releaseTime": 1477411200000,
            "playInfo": [
              {
                "height": 480,
                "width": 854,
                "name": "标清",
                "type": "normal",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10556&editionType=normal"
              },
              {
                "height": 720,
                "width": 1280,
                "name": "高清",
                "type": "high",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10556&editionType=high"
              }
            ],
            "consumption": {
              "collectionCount": 793,
              "shareCount": 1798,
              "replyCount": 22
            },
            "campaign": null,
            "waterMarks": null,
            "adTrack": null,
            "tags": [
              {
                "id": 14,
                "name": "动画",
                "actionUrl": "eyepetizer://tag/14/?title=%E5%8A%A8%E7%94%BB",
                "adTrack": null
              },
              {
                "id": 56,
                "name": "3D",
                "actionUrl": "eyepetizer://tag/56/?title=3D",
                "adTrack": null
              },
              {
                "id": 140,
                "name": "搞笑",
                "actionUrl": "eyepetizer://tag/140/?title=%E6%90%9E%E7%AC%91",
                "adTrack": null
              },
              {
                "id": 498,
                "name": "萌",
                "actionUrl": "eyepetizer://tag/498/?title=%E8%90%8C",
                "adTrack": null
              },
              {
                "id": 522,
                "name": "野生动物",
                "actionUrl": "eyepetizer://tag/522/?title=%E9%87%8E%E7%94%9F%E5%8A%A8%E7%89%A9",
                "adTrack": null
              }
            ],
            "type": "NORMAL",
            "idx": 0,
            "shareAdTrack": null,
            "favoriteAdTrack": null,
            "webAdTrack": null,
            "date": 1477411200000,
            "promotion": null,
            "label": null,
            "collected": false,
            "played": false
          }
        },
        {
          "type": "video",
          "data": {
            "dataType": "VideoBeanForClient",
            "id": 8916,
            "title": "约会奇遇：城市套路深",
            "description": "法国金胡子一贯的神奇套路，脑洞清奇。男女一场再平常不过的约会背后却这般令人大跌眼镜。看到最后你就会觉得，这一生走过最长的路，是你给我下的套路... From @柚子木字幕组",
            "provider": {
              "name": "哔哩哔哩动画",
              "alias": "bilibili",
              "icon": "http://img.kaiyanapp.com/b968890a2b3e9ab5ae234175681f8cd4.png"
            },
            "category": "剧情",
            "author": null,
            "cover": {
              "feed": "http://img.kaiyanapp.com/cb4a27b9396d43e14b52ed68c420e0cf.jpeg?imageMogr2/quality/60",
              "detail": "http://img.kaiyanapp.com/cb4a27b9396d43e14b52ed68c420e0cf.jpeg?imageMogr2/quality/60",
              "blurred": "http://img.kaiyanapp.com/7ba8323562df5483ed6546696cdaf0e3.jpeg?imageMogr2/quality/60",
              "sharing": null
            },
            "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=8916&editionType=default",
            "duration": 108,
            "webUrl": {
              "raw": "http://www.eyepetizer.net/detail.html?vid=8916",
              "forWeibo": "http://www.wandoujia.com/eyepetizer/detail.html?vid=8916"
            },
            "releaseTime": 1477411200000,
            "playInfo": [
              {
                "height": 480,
                "width": 854,
                "name": "标清",
                "type": "normal",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=8916&editionType=normal"
              },
              {
                "height": 720,
                "width": 1280,
                "name": "高清",
                "type": "high",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=8916&editionType=high"
              }
            ],
            "consumption": {
              "collectionCount": 640,
              "shareCount": 3044,
              "replyCount": 48
            },
            "campaign": null,
            "waterMarks": null,
            "adTrack": null,
            "tags": [
              {
                "id": 140,
                "name": "搞笑",
                "actionUrl": "eyepetizer://tag/140/?title=%E6%90%9E%E7%AC%91",
                "adTrack": null
              },
              {
                "id": 12,
                "name": "剧情",
                "actionUrl": "eyepetizer://tag/12/?title=%E5%89%A7%E6%83%85",
                "adTrack": null
              },
              {
                "id": 108,
                "name": "爱情",
                "actionUrl": "eyepetizer://tag/108/?title=%E7%88%B1%E6%83%85",
                "adTrack": null
              },
              {
                "id": 490,
                "name": "脑洞",
                "actionUrl": "eyepetizer://tag/490/?title=%E8%84%91%E6%B4%9E",
                "adTrack": null
              },
              {
                "id": 126,
                "name": "重口",
                "actionUrl": "eyepetizer://tag/126/?title=%E9%87%8D%E5%8F%A3",
                "adTrack": null
              }
            ],
            "type": "NORMAL",
            "idx": 0,
            "shareAdTrack": null,
            "favoriteAdTrack": null,
            "webAdTrack": null,
            "date": 1477411200000,
            "promotion": null,
            "label": null,
            "collected": false,
            "played": false
          }
        },
        {
          "type": "video",
          "data": {
            "dataType": "VideoBeanForClient",
            "id": 10358,
            "title": "她家的北欧风接着北京的地气",
            "description": "在旅居瑞典十五年后 设计师在北京为自己打造了一间北欧格调却又接地气的家",
            "provider": {
              "name": "PGC",
              "alias": "PGC",
              "icon": ""
            },
            "category": "生活",
            "author": {
              "id": 204,
              "icon": "http://img.kaiyanapp.com/68ff353a77b54d90cc99106adece2f45.jpeg",
              "name": "住艺",
              "description": "康泰纳仕「安邸 AD」关联设计师精选平台，精选大咖设计师改造家视频，讲解改造趣事，分享设计灵感。",
              "link": "",
              "latestReleaseTime": 1477481236000,
              "videoNum": 12,
              "adTrack": null
            },
            "cover": {
              "feed": "http://img.kaiyanapp.com/aebb398a3cab964efc255496aad60edf.jpeg?imageMogr2/quality/60",
              "detail": "http://img.kaiyanapp.com/aebb398a3cab964efc255496aad60edf.jpeg?imageMogr2/quality/60",
              "blurred": "http://img.kaiyanapp.com/60efe7473dc2d053203c1ce22fba223e.jpeg?imageMogr2/quality/60",
              "sharing": null
            },
            "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10358&editionType=default",
            "duration": 205,
            "webUrl": {
              "raw": "http://www.eyepetizer.net/detail.html?vid=10358",
              "forWeibo": "http://wandou.im/36fd2g"
            },
            "releaseTime": 1476871535000,
            "playInfo": [
              {
                "height": 480,
                "width": 854,
                "name": "标清",
                "type": "normal",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10358&editionType=normal"
              },
              {
                "height": 720,
                "width": 1280,
                "name": "高清",
                "type": "high",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10358&editionType=high"
              }
            ],
            "consumption": {
              "collectionCount": 398,
              "shareCount": 462,
              "replyCount": 36
            },
            "campaign": null,
            "waterMarks": null,
            "adTrack": null,
            "tags": [
              {
                "id": 666,
                "name": "生活",
                "actionUrl": "eyepetizer://tag/666/?title=%E7%94%9F%E6%B4%BB",
                "adTrack": null
              },
              {
                "id": 596,
                "name": "家居",
                "actionUrl": "eyepetizer://tag/596/?title=%E5%AE%B6%E5%B1%85",
                "adTrack": null
              },
              {
                "id": 24,
                "name": "记录",
                "actionUrl": "eyepetizer://tag/24/?title=%E8%AE%B0%E5%BD%95",
                "adTrack": null
              }
            ],
            "type": "NORMAL",
            "idx": 0,
            "shareAdTrack": null,
            "favoriteAdTrack": null,
            "webAdTrack": null,
            "date": 1477411200000,
            "promotion": null,
            "label": null,
            "collected": false,
            "played": false
          }
        },
        {
          "type": "video",
          "data": {
            "dataType": "VideoBeanForClient",
            "id": 9692,
            "title": "喵星人的生日大餐",
            "description": "每年 Kohaku 生日这天，主人会为它做这样一顿大餐：将海鲷、鲑鱼、鸡胸肉、黄鳍金枪鱼煮熟，切成小块加入鲣鱼汤，再撒上一些猫薄荷粉。总之人不如猫，不过这位铲屎官，你其实在秀刀工对吧。From JunsKitchen",
            "provider": {
              "name": "YouTube",
              "alias": "youtube",
              "icon": "http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"
            },
            "category": "萌宠",
            "author": null,
            "cover": {
              "feed": "http://img.kaiyanapp.com/2202a2ad2b5eec5d20c07ac38add6206.jpeg?imageMogr2/quality/60",
              "detail": "http://img.kaiyanapp.com/2202a2ad2b5eec5d20c07ac38add6206.jpeg?imageMogr2/quality/60",
              "blurred": "http://img.kaiyanapp.com/f852a2b01665d051fce637949a5a36d3.jpeg?imageMogr2/quality/60",
              "sharing": null
            },
            "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=9692&editionType=default",
            "duration": 171,
            "webUrl": {
              "raw": "http://www.eyepetizer.net/detail.html?vid=9692",
              "forWeibo": "http://wandou.im/31a1um"
            },
            "releaseTime": 1477411200000,
            "playInfo": [
              {
                "height": 480,
                "width": 854,
                "name": "标清",
                "type": "normal",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=9692&editionType=normal"
              },
              {
                "height": 720,
                "width": 1280,
                "name": "高清",
                "type": "high",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=9692&editionType=high"
              }
            ],
            "consumption": {
              "collectionCount": 379,
              "shareCount": 1004,
              "replyCount": 33
            },
            "campaign": null,
            "waterMarks": null,
            "adTrack": null,
            "tags": [
              {
                "id": 24,
                "name": "记录",
                "actionUrl": "eyepetizer://tag/24/?title=%E8%AE%B0%E5%BD%95",
                "adTrack": null
              },
              {
                "id": 32,
                "name": "萌宠",
                "actionUrl": "eyepetizer://tag/32/?title=%E8%90%8C%E5%AE%A0",
                "adTrack": null
              },
              {
                "id": 350,
                "name": "日本",
                "actionUrl": "eyepetizer://tag/350/?title=%E6%97%A5%E6%9C%AC",
                "adTrack": null
              }
            ],
            "type": "NORMAL",
            "idx": 0,
            "shareAdTrack": null,
            "favoriteAdTrack": null,
            "webAdTrack": null,
            "date": 1477411200000,
            "promotion": null,
            "label": null,
            "collected": false,
            "played": false
          }
        },
        {
          "type": "video",
          "data": {
            "dataType": "VideoBeanForClient",
            "id": 10004,
            "title": "吃秋葵的季节，这几道美餐不可错过",
            "description": "秋葵做得好，撩胃实力想不到。",
            "provider": {
              "name": "PGC",
              "alias": "PGC",
              "icon": ""
            },
            "category": "开胃",
            "author": {
              "id": 82,
              "icon": "http://img.kaiyanapp.com/7bbf21a5272bc308a19a78aab4359773.jpeg",
              "name": "微在涨姿势",
              "description": "国内首个生产神技能的原创视频基地；擅长脑洞大开，盛产闻所未闻。一日一姿势——有知识，才性感。",
              "link": "",
              "latestReleaseTime": 1477540174000,
              "videoNum": 41,
              "adTrack": null
            },
            "cover": {
              "feed": "http://img.kaiyanapp.com/226e4735f02805f974586eb917b68d83.jpeg?imageMogr2/quality/60",
              "detail": "http://img.kaiyanapp.com/226e4735f02805f974586eb917b68d83.jpeg?imageMogr2/quality/60",
              "blurred": "http://img.kaiyanapp.com/0c151d3421ce66d20d4b62376ed13596.jpeg?imageMogr2/quality/60",
              "sharing": null
            },
            "playUrl": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10004&editionType=default",
            "duration": 174,
            "webUrl": {
              "raw": "http://www.eyepetizer.net/detail.html?vid=10004",
              "forWeibo": "http://wandou.im/34eehh"
            },
            "releaseTime": 1476087575000,
            "playInfo": [
              {
                "height": 480,
                "width": 854,
                "name": "标清",
                "type": "normal",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10004&editionType=normal"
              },
              {
                "height": 720,
                "width": 1280,
                "name": "高清",
                "type": "high",
                "url": "http://baobab.kaiyanapp.com/api/v1/playUrl?vid=10004&editionType=high"
              }
            ],
            "consumption": {
              "collectionCount": 1002,
              "shareCount": 1210,
              "replyCount": 21
            },
            "campaign": null,
            "waterMarks": null,
            "adTrack": null,
            "tags": [
              {
                "id": 20,
                "name": "开胃",
                "actionUrl": "eyepetizer://tag/20/?title=%E5%BC%80%E8%83%83",
                "adTrack": null
              },
              {
                "id": 48,
                "name": "盘点",
                "actionUrl": "eyepetizer://tag/48/?title=%E7%9B%98%E7%82%B9",
                "adTrack": null
              },
              {
                "id": 264,
                "name": "素食",
                "actionUrl": "eyepetizer://tag/264/?title=%E7%B4%A0%E9%A3%9F",
                "adTrack": null
              }
            ],
            "type": "NORMAL",
            "idx": 0,
            "shareAdTrack": null,
            "favoriteAdTrack": null,
            "webAdTrack": null,
            "date": 1477411200000,
            "promotion": null,
            "label": null,
            "collected": false,
            "played": false
          }
        }
      ],
      "count": 11
    }
  ],
  "nextPageUrl": "http://baobab.kaiyanapp.com/api/v2/feed?date=1477324800000&num=2",
  "nextPublishTime": 1477670400000,
  "newestIssueType": "normal",
  "dialog": null
}
```
###	4、评论Api
####	1.针对某一个具体的视频的评论详情(http://baobab.wandoujia.com/api/v1/replies/video?id=10004)
参数说明：
|参数|说明|备注|
|:------:|:------:|:------:|
|id|视频的id|整数，从data中获取|
返回示例：
```json
{
  "replyList": [
    {
      "id": 791301236786757632,
      "videoId": 10004,
      "videoTitle": "吃秋葵的季节，这几道美餐不可错过",
      "parentReplyId": 0,
      "sequence": 22,
      "message": "好棒！",
      "replyStatus": "PUBLISHED",
      "createTime": 1477495891000,
      "user": {
        "uid": 219497610,
        "nickname": "安屠生",
        "avatar": "http://img.wdjimg.com/image/account/5800bf40ae2ce73ba0571cc65ac2df82_300_300.png"
      },
      "likeCount": 1,
      "liked": false,
      "hot": false
    }
      ],
  "count": 10,
  "total": 21,
  "nextPageUrl": "http://baobab.kaiyanapp.com/api/v1/replies/video?lastId=13&id=10004&num=10"
}
```
####	2.返回从1到lastId的评论(http://baobab.wandoujia.com/api/v1/replies/video?num=10&id=10004&lastId=10)
参数说明：
|参数|说明|备注|
|:------:|:------:|:------:|
|id|视频的id|replyList->videoId|
|lastId|整数|replyList->sequence|
返回示例：
```json
{
  "replyList": [
    {
      "id": 790951639354736640,
      "videoId": 10004,
      "videoTitle": "吃秋葵的季节，这几道美餐不可错过",
      "parentReplyId": 0,
      "sequence": 9,
      "message": "有点模仿M＆S",
      "replyStatus": "PUBLISHED",
      "createTime": 1477412540000,
      "user": {
        "uid": 195142052,
        "nickname": "Okami.倔强",
        "avatar": "http://img.wdjimg.com/image/account/48d2fc3c08b1cc5a283596f45856b5e9_300_300.png"
      },
      "likeCount": 0,
      "liked": false,
      "hot": false
    }
      ],
  "count": 9,
  "total": 21,
  "nextPageUrl": null
}
```
