angular.module("veiculo").config(function ($routeProvider) {
	$routeProvider.when("/veiculo", {
		templateUrl: "index.html",
		controller: "veiculoCtrl"
	});
});