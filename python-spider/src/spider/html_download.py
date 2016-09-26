'''
Created on 2016Äê6ÔÂ27ÈÕ

@author: Bing
'''

import urllib


class HtmlDownloader(object):
    
    
    def download(self,url):
        if url is None:
            return None
        
        response=urllib.request.urlopen(url)
        
        if response.getcodez()!=200:
            return None
        
        return response.read()
    



