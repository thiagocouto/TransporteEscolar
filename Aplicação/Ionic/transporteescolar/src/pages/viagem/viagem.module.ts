import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { Viagem } from './viagem';

@NgModule({
  declarations: [
    Viagem,
  ],
  imports: [
    IonicPageModule.forChild(Viagem),
  ],
  exports: [
    Viagem
  ]
})
export class ViagemModule {}
