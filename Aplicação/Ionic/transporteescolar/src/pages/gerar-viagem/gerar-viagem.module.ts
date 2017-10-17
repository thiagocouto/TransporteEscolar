import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { GerarViagem } from './gerar-viagem';

@NgModule({
  declarations: [
    GerarViagem,
  ],
  imports: [
    IonicPageModule.forChild(GerarViagem),
  ],
  exports: [
    GerarViagem
  ]
})
export class GerarViagemModule {}
