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
//        if ($scope.formulario.$valid) {
//            cadastroDeFotos.cadastrar($scope.foto)
//            .then(function(dados) {
//                $scope.mensagem = dados.mensagem;
//                if (dados.inclusao) $scope.foto = {};                
//            })
//            .catch(function(erro) {
//                $scope.mensagem = erro.mensagem;
//            });
//        }
		
        /*$http({
            method: 'GET',
            url: 'teste'
        }).then(function (msg) {
            console.log(msg);
        }, function (erro) {
            console.log(erro);
        });*/
        $location.path('/outra-coisa');
		//var mensagem = $scope.user.username
		//alert('opa ' + mensagem)		
    };
});