# No Blocklist Lookup

This is a very simple mod which disables the API request to retrieve the blocklist for your Microsoft account, which
can, in some cases, lag the client.

As of writing this (2022-01-06), the API is not working properly which is causing the client to attempt to fetch 
the blocklist on every chat message with a 2 minute cooldown, causing the client to freeze after every 2 minutes 
when someone chats.

You should not use this mod if you need the blocklist.