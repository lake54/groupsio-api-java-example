package com.github.lake54.groupsio.api_example;

import java.io.IOException;
import java.net.URISyntaxException;

import com.github.lake54.groupsio.api.GroupsIOApiClient;
import com.github.lake54.groupsio.api.exception.GroupsIOApiException;

public class ClientTest
{
    public static void main(final String[] args) throws URISyntaxException, GroupsIOApiException, IOException
    {
        // arg0 = API key
        // arg1 = email address
        // arg2 = password
        final GroupsIOApiClient client = new GroupsIOApiClient(args[0], args[1], args[2]);
        client.login();
    }
}
