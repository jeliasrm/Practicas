app.controller('Alumnos', ['$scope', 
	function($scope){
			$scope.alumnos=[
					{nombre:"Juan Blanco", telefono: "1234567890", curso:"Segundo ESO"},
					{nombre:"Rosa Luxemburgo", telefono: "0987654321", curso:"Primero ESO"},
					{nombre:"Alberto Herrera", telefono: "1122334455", curso:"Segundo ESO"},
					{nombre:"Ana Mariño", telefono: "6677889900", curso:"Tercero ESO"}
					];

			$scope.Save = function(){
				$scope.alumnos.push(
					{
						nombre:$scope.nuevoAlumno.nombre, 
						telefono:$scope.nuevoAlumno.telefono, 
						curso:$scope.nuevoAlumno.curso
					}
				);
				$scope.formVisibility = false;
			}

			$scope.ShowForm = function(){
				$scope.formVisibility = true;
			}
	}
]);

app.controller('Tareas', ['$scope', 
	function($scope){
		$scope.tareas = [
							{texto: 'Aprender Angular', hecho: true},
							{texto: 'Aprender Spring', hecho: false}
						];
		$scope.Agregar = function(){
			$scope.tareas.push({texto:$scope.nuevaTarea.texto, hecho:false});
			$scope.nuevaTarea = '';
		};
		$scope.restantes = function(){
			var cuenta = 0;
			angular.forEach($scope.tareas, function(tareas){
				cuenta += tareas.hecho ? 0 : 1; 
			});
			return cuenta;
		};
		$scope.eliminar = function(){
			var tareasViejas = $scope.tareas;
			$scope.tareas = [];
			angular.forEach(tareasViejas, function(tareas){
				if(!tareas.hecho)
					$scope.tareas.push(tareas);
			});
		}
	}
]);

app.controller('ControladorFiltros', ['$scope', 
	function($scope) {
  		$scope.empleados =
    		[
		      {
		        nombre:'Ana', paterno: 'Guzman', materno: 'Guzman', primerDia: new Date(),
		        salario: 12000, telefono:'5587687687', bono: 1.456789
		      },
		      {
		        nombre:'Adrian', paterno: 'Romero', materno: 'Paez', primerDia:  new Date(),
		        salario: 12000, telefono:'5512345678', bono: 9.654321
		      },
		      {
		        nombre:'Rodolfo', paterno: 'Solares', materno: 'Madero', primerDia:  new Date(),
		        salario: 14000, telefono:'5587654321', bono: 7.333333
		      },
		      {
		        nombre:'Manuel', paterno: 'Perez', materno: 'Solin', primerDia:  new Date(),
		        salario: 11000, telefono:'5518273645', bono: 5.272727
		      },
		      {
		        nombre:'Dana', paterno: 'Roman', materno: 'Herrera', primerDia:  new Date(),
		        salario: 20000, telefono:'5581726354', bono: 1.444444
		      },
		      {
		        nombre:'Alejandro', paterno: 'Mena', materno: 'Morales', primerDia:  new Date(),
		        salario: 5000, telefono:'5512312312', bono: 12.989898
		      }
    		];

     $scope.gridOptions = {
     		data: 'empleados',
     		enableCellSelection: true,
     		enableCellEdit: true,
     		enablePinning: true,
     		columnDefs:[
	     		{field: "nombre", displayName: 'Name', cellFilter: 'stringArrayFilter', width: 120, pinned: true},
	     		{field: "paterno", displayName: 'Paterno', pinned: true},
	     		{field: "materno", displayName: 'Materno', pinned: true},
	     		{field: "primerDia", cellFilter: 'date', displayName: 'Contratacion', enableCellEdit: false, pinned: true},
	     		{field: "salario", cellFilter: 'currency:$', displayName: 'Salario', enableCellEdit: false, pinned: true},
	     		{field: "telefono", displayName: 'Telefono', width: 120, pinned: true},
	     		{field: "bono", displayName:'Bono', cellFilter: 'number:2', width: 200, enableCellEdit: false, pinned: false}
	     	],
	     	filterOptions: {filterText: 'Name:', useExternalFilter: false},
    		showFilter: true
     };

	 $scope.ordenarPor = function(orden) {
	    $scope.ordenSeleccionado = orden;
	 };

 	}
 ]);

app.filter('stringArrayFilter', function(){
	return function(myArray){
		return "" + myArray;
	};
});

app.filter('currency', function () {
        return function (input) {
          return "USD $" + input;
        };
    });