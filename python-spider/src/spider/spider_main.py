'''
Created on 2016Äê6ÔÂ27ÈÕ

@author: Bing
'''

import spider
from spider import url_manager, html_download, html_parse, html_outputer


class SpiderMain(object):
    def __init__(self):
        self.urls=url_manager.UrlManager()
        self.downloader=html_download.HtmlDownloader()
        self.parser=html_parse.HtmlParser()
        self.outputer=html_outputer.HtmlOutputer()
        
    
    def craw(self, root_url):
        count=1
        self.urls.add_new_url(root_url)
        while self.urls.has_new_url():
            try:
                new_url=self.urls.get_new_url()
                print(count,new_url)
                html_cont=self.downloader.download(new_url)
                new_urls,new_data=self.parser.parse(new_url,html_cont)
                self.urls.add_new_urls(new_urls)
                self.outputer.collect_data(new_data)
            
                if count==1000:
                    break
            
                count=count+1
            except:
                print("craw failed")
        self.outputer.output_html()
    
    



if __name__=="__main__":
    root_url="http://baike.baidu.com/view/21087.htm"
    obj_spider=SpiderMain()
    obj_spider.craw(root_url)
    