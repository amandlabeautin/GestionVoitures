'use strict';

var rentControllers = angular.module('rentControllers', []);

rentControllers.controller("rentController", function($scope,$http,$routeParams) {

	$http.get('http://localhost:8080/voiture').
	  success(function(data, status, headers, config) {
	  	$scope.listeVoitures = data;
	  	$scope.selected = data[0];
	  }).
	  error(function(data, status, headers, config) {
	  });

        
});
