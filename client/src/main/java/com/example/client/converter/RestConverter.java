package com.example.client.converter;


public interface RestConverter<Entity, Response, Request> {
        Response Response(Response entity);

        Entity Request(Request dto);
}
