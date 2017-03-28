'use strict';

var app = angular.module('GestionVoitures', [
	'ngRoute','rentControllers'                                               ]);

app.config(['$routeProvider',
	function($routeProvider) {
		$routeProvider.
			when('/gestionVoitures', {
				templateUrl: 'partials/menu.html'
			}).
			when('/gestionVoitures/listeVoitures', {
				templateUrl: 'partials/listerVoitures.html',
				controller: 'rentController'
			}).
			otherwise({
				redirectTo: '/gestionVoitures'
			});
}]);
