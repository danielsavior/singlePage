/*global angular */
/*global console */
angular.module('restaurante').controller('LoginController', function ($scope, $http, $location) {
	'use strict';
    $scope.foto = {
        titulo : 'Logo',
        url : 'http://www.fundosanimais.com/Minis/leoes.jpg'
    };
	//ao criar esse objeto no controller, quando eu usar ng-model="user.username"
	//o campo username será criado aqui automáticamente.
	$scope.user = {};
	$scope.submeter = function () {
		if ($scope.formlogin.$valid){
			$http.post('http://localhost:9005/efetuar-login',$scope.user)
			.then(function(retorno) {
				$scope.user = retorno.data;
				$location.path('/sucesso-login');
				console.log(retorno.data);
            })
            .catch(function(erro) {
            	$location.path('/falha-login');;
            })			
		}else{
			$location.path('/falha-login');
		}
    };
});