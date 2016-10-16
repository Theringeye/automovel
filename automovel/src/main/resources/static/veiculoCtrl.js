angular.module("veiculo").controller("veiculoCtrl", function ($scope, $http) {
		$scope.novoVeiculo = function (veiculo) {
			$http.post("veiculo/novo", veiculo).success(function (resultadoDoResponse) {
				$scope.veiculo = resultadoDoResponse;
			});
		};		
	});
