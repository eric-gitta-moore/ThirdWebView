# WebViewStudy
[![fir.im][1]][2] [![version][3]][4] 

<!--![](https://img.shields.io/github/stars/youlookwhat/WebViewStudy.svg?style=flat-square) ![](https://img.shields.io/github/forks/youlookwhat/WebViewStudy.svg?style=flat-square) ![GitHub watchers](https://img.shields.io/github/watchers/youlookwhat/WebViewStudy.svg?style=flat-square&label=Watch)
-->
## Function

 - 基本配置使用(宽度自适应、返回网页上一层、显示网页标题等)
 - 唤起三方应用(拨打电话、发送短信、发送邮件等)
 - 上传图片(版本兼容)
 - 全屏播放网络视频
 - **与JS交互实例**
 - DeepLink的基本使用
 - 被作为第三方浏览器打开
 - **腾讯x5使用示例**
 - 优雅的进度条显示控件

## Document

 - [Android 关于WebView全方面的使用（项目应用篇）](http://www.jianshu.com/p/163d39e562f0)
 - [Android DeepLink介绍与使用](https://www.jianshu.com/p/127c80f62655)
 - [Android 应用被作为第三方浏览器打开](https://www.jianshu.com/p/272bfb6c0779)
 - [Android WebView与JS交互实例](https://www.jianshu.com/p/97f52819a19d)
 - [一款Android WebView进度条显示控件，使其加载进度平滑过渡](https://github.com/youlookwhat/WebProgress)
 
## Screenshots
 
 <img width="260" height=“374” src="https://github.com/youlookwhat/WebViewStudy/blob/master/art/view_00.png"></img>
 <img width="260" height=“374” src="https://github.com/youlookwhat/WebViewStudy/blob/master/art/电话短信邮件测试.png"></img>
 <img width="260" height=“374” src="https://github.com/youlookwhat/WebViewStudy/blob/master/art/上传图片.png"></img>

## Download
 - [Fir.im下载][4]

<img width="300" height=“300” src="https://github.com/youlookwhat/WebViewStudy/blob/master/art/download.png"></img>


 
## Tip
 - 混淆时应加上（通过JS向网页传值，如不加有时候会传值失败）:

   ```java
   -keepattributes *Annotation*
   -keepattributes *JavascriptInterface*
   -keepclassmembers class * {
      @android.webkit.JavascriptInterface <methods>;
   }
   
## Other
 - [WebView的使用及实战](http://www.jianshu.com/p/dbf9b7c04be5)
 - [WebView性能、体验分析与优化](https://tech.meituan.com/WebViewPerf.html)
 - [Android WebView开发问题及优化汇总](http://www.cnblogs.com/spring87/p/4532687.html)
 - [https://developer.android.com/reference/android/webkit/WebSettings.html](https://developer.android.com/reference/android/webkit/WebSettings.html)
   
[1]:https://img.shields.io/badge/download-fir.im-brightgreen.svg?style=flat
[2]:http://d.6short.com/webviewstudy

[3]:https://img.shields.io/badge/version-2.7.2-brightgreen.svg?style=flat
[4]:http://d.6short.com/webviewstudy