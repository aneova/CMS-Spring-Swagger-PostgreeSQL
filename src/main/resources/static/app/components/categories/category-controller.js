(function (angular) {
  'use strict';

  // Controllers
  angular.module('cms.modules.category.controllers', []).

  controller('CategoryCreateController',
      ['$scope', 'CategoryService','$state',
        function ($scope, CategoryService,$state) {

          $scope.resetForm = function () {
              console.log("Success on DELETE Category!!!")
            $scope.category = null;
          };

            $scope.doClick = function () {
                alert('I click');
            };

          $scope.create = function (category) {
            CategoryService.create(category).then(
                function (data) {
                  console.log("Success on create Category!!!")
                  $state.go('categories')
                }, function (err) {
                  console.log("Error on create Category!!!")
                });
          };

            $scope.remove = function (category) {

                // CategoryService.create(category).then(
                //     function (data) {
                //         console.log("Success on create Category!!!")
                //         $state.go('categories')
                //     }, function (err) {
                //         console.log("Error on create Category!!!")
                //     });
            };
        }]).

  controller('CategoryListController',
      ['$scope', 'CategoryService',
        function ($scope, CategoryService) {
          CategoryService.find().then(function (data) {
            $scope.categories = data.data;
          }, function (err) {
            console.log(err);
          });
        }]);
})(angular);
