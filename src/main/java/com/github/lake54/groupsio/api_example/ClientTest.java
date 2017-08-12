package com.github.lake54.groupsio.api_example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import com.github.lake54.groupsio.api.GroupsIOApiClient;
import com.github.lake54.groupsio.api.domain.Subscription;
import com.github.lake54.groupsio.api.exception.GroupsIOApiException;

public class ClientTest
{
    public static void main(final String[] args) throws URISyntaxException, GroupsIOApiException, IOException
    {
        // arg0 = API key
        // arg1 = email address
        // arg2 = password
        
        final String apiKey = args[0];
        final String email = args[1];
        final String password = args[2];
        final GroupsIOApiClient client = new GroupsIOApiClient(apiKey, email);
        client.user().login(password);
        final List<Subscription> subs = client.user().getSubscriptions();
        for (final Subscription sub : subs)
        {
            client.member().getMembersInGroup(sub.getGroupId()).get(0).toString();
        }
        
    }
}
