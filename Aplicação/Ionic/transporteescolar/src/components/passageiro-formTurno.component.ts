import {Component, Input} from "@angular/core"

@Component({
    selector: 'component-passageiro-formTurno',
    templateUrl: 'passageiro-formTurno.component.html',
})

export class PassageiroFormTurnoComponent{
    
    turnos = [{valor: 'MANHA', descricao: 'Manhã'},
              {valor: 'TARDE', descricao: 'Tarde'},
              {valor: 'NOITE', descricao: 'Noite'}];           
              
    _passageiro: any;

    @Input()
    set passageiro(passageiro){
        this._passageiro = passageiro;
    }

    get passageiro(){
        return this._passageiro;
    }
}