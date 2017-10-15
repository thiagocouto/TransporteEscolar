import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { PassageiroChange } from './passageiro-change';

@NgModule({
  declarations: [
    PassageiroChange,
  ],
  imports: [
    IonicPageModule.forChild(PassageiroChange),
  ],
  exports: [
    PassageiroChange
  ]
})
export class PassageiroChangeModule {}
