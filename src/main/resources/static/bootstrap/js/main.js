angular.module('restaurante', ['ngAnimate','ngRoute'])
.config(function($routeProvider, $locationProvider) {
    $locationProvider.html5Mode(true);
    $routeProvider.when('/', {
        templateUrl: 'bootstrap/html/login.html',
        controller: 'LoginController'        
    });
    
    $routeProvider.when('/sucesso-login', {
    	template: '<h1>Sucesso!</h1>',
        controller: 'LoginController'
    });
    
    $routeProvider.when('/falha-login', {
        template: "<h1>Falha ao efetuar login"
    });
    
    $routeProvider.otherwise({redirectTo: '/'});
});
