# Video Monitor
This serves to stream video in an out of a local RTMP video server using an Android Phone as a camera and receiver

_Disclaimer_

I have not verified or tested the security of this app being used outside a secured local network, Nor do Intend to for the foreseeable future as it is outside my use case for now
## Dependencies
The streaming is handled by [this](https://github.com/pedroSG94/rtmp-rtsp-stream-client-java) library

### Things needed to run out side of the app
* You will need at least one android phone 
* RTMP server to connect to, the use case for this is a DIY video baby monitor so I am hooking in to a local RTMP Server and streaming through my local network
