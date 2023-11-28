import { Field, useField } from 'formik'
import React from 'react'

export default function CheckBox({...props}) {

    const [field, meta] = useField(props)

  return (
    
    <Field {...field} {...props} />
  )
}
