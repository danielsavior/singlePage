angular.module('restaurante', ['ngAnimate','ngRoute'])
.config(function($routeProvider, $locationProvider) {
    $locationProvider.html5Mode(true);
    $routeProvider.when('/', {
        templateUrl: 'bootstrap/html/login.html',
        controller: 'LoginController'        
    });
    
    $routeProvider.when('/teste', {
        //templateUrl: 'bootstrap/html/login.html',
    	template: '<h1>cheguei no teste</h1>',
        controller: 'LoginController'        
    });
    
    $routeProvider.otherwise({redirectTo: '/'});
});