*This mod has been archived because it is not needed anymore. Mojang/Microsoft have fixed the blocklist API.  
The [async-chat-mod](https://github.com/totorewa/async-chat-mod) will remain though as it's probably still a good idea
to handle chat on a different thread anyway.*

# No Blocklist Lookup

This is a very simple and barebones mod which disables the API request to retrieve the blocklist for 
your Microsoft account, which can, in some cases, lag the client.

~~As of writing this (2022-01-06), Mojang's blocklist API is not working properly which is causing the client to attempt 
to fetch the blocklist on every chat message with a 2 minute cooldown, causing the client to freeze after every 
2 minutes when someone sends a chat message.~~

You should not use this mod if you need the blocklist. If you don't want to disable the blocklist, you may alternatively use [async-chat-mod](https://github.com/totorewa/async-chat-mod) which instead offloads chat messages to another thread to prevent the render loop from getting blocked.
