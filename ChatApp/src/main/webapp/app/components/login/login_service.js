/*global angular*/
var appLoginModule = angular.module('app.Login', []);

appLoginModule.factory('Login', function (WebSocket) {
    "use strict";

    return {
        login: function (username, password, onSuccess, onError) {
            WebSocket.addOnMessageListener('login', function (data) {
                var object = JSON.parse(data);
                if (object.success) {
                    object.data = JSON.parse(object.payload);
                    onSuccess(object);
                } else {
                    onError({message: object.payload});
                }
            });

            WebSocket.send({
                username: username,
                password: password
            }, 'login')
        }
    };

});