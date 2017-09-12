import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { PassageiroInsert } from './passageiro-insert';

@NgModule({
  declarations: [
    PassageiroInsert,
  ],
  imports: [
    IonicPageModule.forChild(PassageiroInsert),
  ],
  exports: [
    PassageiroInsert
  ]
})
export class PassageiroInsertModule {}
